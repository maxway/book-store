package com.max.bookstore.security;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.persistence.NonUniqueResultException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import com.max.bookstore.model.People;

public class BookstoreAuthenticationProvider extends
		AbstractUserDetailsAuthenticationProvider {

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {

	}

	@Override
	protected UserDetails retrieveUser(String username,
			UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {
		logger.debug("Use my own authentication provider!");
		// TODO: in future we will support password, but now email is enough
		String password = (String) authentication.getCredentials();

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		try {
			People people = People.findPeoplesByEmailAndNameEquals(username,
					password).getSingleResult();
			authorities.add(new GrantedAuthorityImpl("ROLE_USER"));
		} catch (EmptyResultDataAccessException e) {
			throw new BadCredentialsException("Invalid username or password");
		} catch (EntityNotFoundException e) {
			throw new BadCredentialsException("Invalid user");
		} catch (NonUniqueResultException e) {
			throw new BadCredentialsException(
					"Non-unique user, contact administrator");
		}

		return new User(username, password, true, true, true, true, authorities);
	}

}

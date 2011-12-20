package com.max.bookstore.model;

import javax.persistence.ManyToOne;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import com.max.bookstore.model.People;

@RooJavaBean
@RooToString
@RooEntity
public class BorrowCard {

    @ManyToOne
    private Book book;

    @ManyToOne
    private People owner;

    @ManyToOne
    private People borrower;
}

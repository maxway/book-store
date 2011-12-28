package com.max.bookstore.model;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity(finders = { "findBookClassesByISBN" })
@Table(name="BOOKCLASS")
public class BookClass {

    @NotNull
    @Column(unique = true)
    private int uuid;

    @NotNull
    private String name;

    private long ISBN;

    @ManyToOne
    private BookCategory category;
}

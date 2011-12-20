package com.max.bookstore.model;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import com.max.bookstore.model.BookCategory;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooEntity
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

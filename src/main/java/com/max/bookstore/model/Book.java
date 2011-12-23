package com.max.bookstore.model;

import javax.persistence.ManyToOne;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import com.max.bookstore.model.BorrowCard;

@RooJavaBean
@RooToString
@RooEntity
public class Book extends BookClass {

    @ManyToOne
    private People owner;
}

package com.max.bookstore.model;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.beans.factory.annotation.Value;
import com.max.bookstore.model.BorrowCard;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import javax.validation.constraints.Size;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;

@RooJavaBean
@RooToString
@RooEntity
public class Status {

    @Value("True")
    private Boolean canBorrow;

    @ManyToOne
    private BorrowCard borrowCard;

    @Size(max = 10)
    @ManyToMany(cascade = CascadeType.ALL)
    private ArrayList<BorrowCard> history = new ArrayList<BorrowCard>();
}

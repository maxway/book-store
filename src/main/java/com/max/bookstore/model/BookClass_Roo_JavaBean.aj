// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.max.bookstore.model;

import com.max.bookstore.model.BookCategory;
import java.lang.String;

privileged aspect BookClass_Roo_JavaBean {
    
    public int BookClass.getUuid() {
        return this.uuid;
    }
    
    public void BookClass.setUuid(int uuid) {
        this.uuid = uuid;
    }
    
    public String BookClass.getName() {
        return this.name;
    }
    
    public void BookClass.setName(String name) {
        this.name = name;
    }
    
    public long BookClass.getISBN() {
        return this.ISBN;
    }
    
    public void BookClass.setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
    
    public BookCategory BookClass.getCategory() {
        return this.category;
    }
    
    public void BookClass.setCategory(BookCategory category) {
        this.category = category;
    }
    
}

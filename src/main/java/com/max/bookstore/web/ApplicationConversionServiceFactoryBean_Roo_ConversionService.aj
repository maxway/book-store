// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.max.bookstore.web;

import com.max.bookstore.model.Book;
import com.max.bookstore.model.BookClass;
import com.max.bookstore.model.BorrowCard;
import com.max.bookstore.model.People;
import java.lang.String;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(new BookConverter());
        registry.addConverter(new BookClassConverter());
        registry.addConverter(new BorrowCardConverter());
        registry.addConverter(new PeopleConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
    static class com.max.bookstore.web.ApplicationConversionServiceFactoryBean.BookConverter implements Converter<Book, String> {
        public String convert(Book book) {
            return new StringBuilder().append(book.getUuid()).append(" ").append(book.getName()).append(" ").append(book.getISBN()).toString();
        }
        
    }
    
    static class com.max.bookstore.web.ApplicationConversionServiceFactoryBean.BookClassConverter implements Converter<BookClass, String> {
        public String convert(BookClass bookClass) {
            return new StringBuilder().append(bookClass.getUuid()).append(" ").append(bookClass.getName()).append(" ").append(bookClass.getISBN()).toString();
        }
        
    }
    
    static class com.max.bookstore.web.ApplicationConversionServiceFactoryBean.BorrowCardConverter implements Converter<BorrowCard, String> {
        public String convert(BorrowCard borrowCard) {
            return new StringBuilder().append(borrowCard.getBorrowDate()).append(" ").append(borrowCard.getReturnDate()).toString();
        }
        
    }
    
    static class com.max.bookstore.web.ApplicationConversionServiceFactoryBean.PeopleConverter implements Converter<People, String> {
        public String convert(People people) {
            return new StringBuilder().append(people.getEmail()).append(" ").append(people.getName()).toString();
        }
        
    }
    
}

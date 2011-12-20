// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.max.bookstore;

import com.max.bookstore.BookClass;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.stereotype.Component;

privileged aspect BookClassDataOnDemand_Roo_DataOnDemand {
    
    declare @type: BookClassDataOnDemand: @Component;
    
    private Random BookClassDataOnDemand.rnd = new SecureRandom();
    
    private List<BookClass> BookClassDataOnDemand.data;
    
    public BookClass BookClassDataOnDemand.getNewTransientBookClass(int index) {
        BookClass obj = new BookClass();
        return obj;
    }
    
    public BookClass BookClassDataOnDemand.getSpecificBookClass(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size() - 1)) index = data.size() - 1;
        BookClass obj = data.get(index);
        return BookClass.findBookClass(obj.getId());
    }
    
    public BookClass BookClassDataOnDemand.getRandomBookClass() {
        init();
        BookClass obj = data.get(rnd.nextInt(data.size()));
        return BookClass.findBookClass(obj.getId());
    }
    
    public boolean BookClassDataOnDemand.modifyBookClass(BookClass obj) {
        return false;
    }
    
    public void BookClassDataOnDemand.init() {
        data = BookClass.findBookClassEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'BookClass' illegally returned null");
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<com.max.bookstore.BookClass>();
        for (int i = 0; i < 10; i++) {
            BookClass obj = getNewTransientBookClass(i);
            try {
                obj.persist();
            } catch (ConstraintViolationException e) {
                StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> it = e.getConstraintViolations().iterator(); it.hasNext();) {
                    ConstraintViolation<?> cv = it.next();
                    msg.append("[").append(cv.getConstraintDescriptor()).append(":").append(cv.getMessage()).append("=").append(cv.getInvalidValue()).append("]");
                }
                throw new RuntimeException(msg.toString(), e);
            }
            obj.flush();
            data.add(obj);
        }
    }
    
}
// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.max.bookstore.model;

import java.lang.String;

privileged aspect BorrowCard_Roo_ToString {
    
    public String BorrowCard.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book: ").append(getBook()).append(", ");
        sb.append("Borrower: ").append(getBorrower()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Owner: ").append(getOwner()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}

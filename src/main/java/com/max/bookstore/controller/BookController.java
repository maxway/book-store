package com.max.bookstore.controller;

import com.max.bookstore.model.Book;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "books", formBackingObject = Book.class)
@RequestMapping("/books")
@Controller
public class BookController {
}

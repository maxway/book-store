package com.max.bookstore.controller;

import com.max.bookstore.model.BookCategory;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "bookcategorys", formBackingObject = BookCategory.class)
@RequestMapping("/bookcategorys")
@Controller
public class BookCategoryController {
}

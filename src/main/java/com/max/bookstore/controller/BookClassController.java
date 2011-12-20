package com.max.bookstore.controller;

import com.max.bookstore.model.BookClass;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "bookclasses", formBackingObject = BookClass.class)
@RequestMapping("/bookclasses")
@Controller
public class BookClassController {
}

package com.max.bookstore.controller;

import com.max.bookstore.model.BorrowCard;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "borrowcards", formBackingObject = BorrowCard.class)
@RequestMapping("/borrowcards")
@Controller
public class BorrowCardController {
}

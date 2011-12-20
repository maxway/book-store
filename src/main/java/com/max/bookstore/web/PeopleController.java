package com.max.bookstore.web;

import com.max.bookstore.model.People;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "peoples", formBackingObject = People.class)
@RequestMapping("/peoples")
@Controller
public class PeopleController {
}

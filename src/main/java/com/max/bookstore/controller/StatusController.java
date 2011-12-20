package com.max.bookstore.controller;

import com.max.bookstore.model.Status;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "statuses", formBackingObject = Status.class)
@RequestMapping("/statuses")
@Controller
public class StatusController {
}

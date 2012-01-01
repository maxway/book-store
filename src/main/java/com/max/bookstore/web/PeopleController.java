package com.max.bookstore.web;

import com.max.bookstore.model.People;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.mail.MailSender;
import org.springframework.beans.factory.annotation.Autowired;

@RooWebScaffold(path = "peoples", formBackingObject = People.class)
@RequestMapping("/peoples")
@Controller
public class PeopleController {

    @Autowired
    private transient MailSender mailTemplate;

    public void sendMessage(String mailFrom, String subject, String mailTo, String message) {
        org.springframework.mail.SimpleMailMessage simpleMailMessage = new org.springframework.mail.SimpleMailMessage();
        simpleMailMessage.setFrom(mailFrom);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setTo(mailTo);
        simpleMailMessage.setText(message);
        //mailTemplate.send(simpleMailMessage);
        // sendMessage("maxway@gmail.com", "Account created", people.getEmail(), "Your account is created!");
    }
}

// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.max.bookstore.web;

import com.max.bookstore.model.People;
import java.io.UnsupportedEncodingException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect PeopleController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST)
    public String PeopleController.create(@Valid People people, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("people", people);
            return "peoples/create";
        }
        uiModel.asMap().clear();
        people.persist();
        return "redirect:/peoples/" + encodeUrlPathSegment(people.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String PeopleController.createForm(Model uiModel) {
        uiModel.addAttribute("people", new People());
        return "peoples/create";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String PeopleController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("people", People.findPeople(id));
        uiModel.addAttribute("itemId", id);
        return "peoples/show";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String PeopleController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            uiModel.addAttribute("peoples", People.findPeopleEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) People.countPeoples() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("peoples", People.findAllPeoples());
        }
        return "peoples/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String PeopleController.update(@Valid People people, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("people", people);
            return "peoples/update";
        }
        uiModel.asMap().clear();
        people.merge();
        return "redirect:/peoples/" + encodeUrlPathSegment(people.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String PeopleController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("people", People.findPeople(id));
        return "peoples/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String PeopleController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        People.findPeople(id).remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/peoples";
    }
    
    @ModelAttribute("peoples")
    public Collection<People> PeopleController.populatePeoples() {
        return People.findAllPeoples();
    }
    
    String PeopleController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        }
        catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}

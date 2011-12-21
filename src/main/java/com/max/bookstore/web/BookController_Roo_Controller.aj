// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.max.bookstore.web;

import com.max.bookstore.model.Book;
import com.max.bookstore.model.BookCategory;
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

privileged aspect BookController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST)
    public String BookController.create(@Valid Book book, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("book", book);
            return "books/create";
        }
        uiModel.asMap().clear();
        book.persist();
        return "redirect:/books/" + encodeUrlPathSegment(book.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String BookController.createForm(Model uiModel) {
        uiModel.addAttribute("book", new Book());
        return "books/create";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String BookController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("book", Book.findBook(id));
        uiModel.addAttribute("itemId", id);
        return "books/show";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String BookController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            uiModel.addAttribute("books", Book.findBookEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Book.countBooks() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("books", Book.findAllBooks());
        }
        return "books/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String BookController.update(@Valid Book book, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("book", book);
            return "books/update";
        }
        uiModel.asMap().clear();
        book.merge();
        return "redirect:/books/" + encodeUrlPathSegment(book.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String BookController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("book", Book.findBook(id));
        return "books/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String BookController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Book.findBook(id).remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/books";
    }
    
    @ModelAttribute("books")
    public Collection<Book> BookController.populateBooks() {
        return Book.findAllBooks();
    }
    
    @ModelAttribute("bookcategorys")
    public Collection<BookCategory> BookController.populateBookCategorys() {
        return BookCategory.findAllBookCategorys();
    }
    
    @ModelAttribute("peoples")
    public Collection<People> BookController.populatePeoples() {
        return People.findAllPeoples();
    }
    
    String BookController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springhiber.control.controls;

import com.springhiber.control.DAO.Books.ServiceBooks;
import com.springhiber.control.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author valera
 */
@Controller
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private ServiceBooks serviceBooks;

 
    @RequestMapping(value = "/addbook", method = RequestMethod.GET)
    public ModelAndView addBook(ModelMap model) {
        return new ModelAndView("addbook", "command", new Books());
    }

    @RequestMapping(value = "/edit/{bookId}", method = RequestMethod.GET)
    public ModelAndView editBook(@PathVariable("bookId") Integer bookId) {

        Books book = serviceBooks.findById(bookId);

        ModelAndView modelAndView = new ModelAndView("editform", "command", new Books());
       
        modelAndView.addObject("book", book);
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getAllBooks(ModelMap model) {
        model.addAttribute("books", serviceBooks.getAllItems());
        return "allbooks";
    }

    @RequestMapping(value = "/updatebook", method = RequestMethod.POST)
    public ModelAndView updateBook(@ModelAttribute("book") Books book) {
        
        this.serviceBooks.insertBook(book);
        ModelAndView modelAndView = new ModelAndView("redirect_allbooks");
        modelAndView.addObject("books", serviceBooks.getAllItems());
        return modelAndView;
    }

    @RequestMapping(value = "edit/editbook", method = RequestMethod.POST)
    public ModelAndView editBookAction(
//            @RequestParam ("id") Integer id,
//            @RequestParam ("author") String author,
//            @RequestParam ("name") String name) {
            
            @ModelAttribute("book") Books book){
            
        //Books book = new Books(id,author, name);
        this.serviceBooks.editBooks(book);
//        System.out.println("+++++++++++++++++++++++" + " receive param " +
//                book.toString() + "=============================" );
        ModelAndView modelAndView = new ModelAndView("redirect_allbooks");
        modelAndView.addObject("books", serviceBooks.getAllItems());
        return modelAndView;
    }
   
    @RequestMapping(value = "/deletebook/{bookId}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable("bookId") Integer bookId,
            ModelMap model) {
        this.serviceBooks.deleteBook(bookId);
        //System.out.println("delete book in controller id = " + bookId + "=================================================");
        model.addAttribute("books", serviceBooks.getAllItems());
        return "allbooks";
    }

  
}

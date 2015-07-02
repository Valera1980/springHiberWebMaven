/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springhiber.control.DAO.Books;

import com.springhiber.control.model.Books;
import java.util.LinkedList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author valera
 */
@Service
public class ServiceBooksImpl implements ServiceBooks {

    @Autowired
    private ActionBooks actionBooks;

    @Override
    public List<Books> getAllItems() {
//        List<Books> books = new LinkedList<Books>();
//        books = actionBooks.getAllBooks();
        return actionBooks.getAllBooks();
    }

    @Override
    public void insertBook(Books book) {
       actionBooks.insertBook(book);
    }

    @Override
    public void deleteBook(Integer idBook) {
     actionBooks.deleteBook(idBook);
      System.out.println("delete book in service=================================================");
    }

    @Override
    public Books findById(Integer id) {
    
        return actionBooks.findBookById(id);
    }

}

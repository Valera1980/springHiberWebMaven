/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springhiber.control.DAO.Books;

import com.springhiber.control.model.Books;
import java.util.List;

/**
 *
 * @author valera
 */
public interface ServiceBooks {
    List<Books> getAllItems();
    void insertBook(Books book);
    void deleteBook(Integer idBook);
}

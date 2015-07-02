/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springhiber.control.DAO.Books;

import com.springhiber.control.model.Books;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author valera
 */
@Repository
public class ActionBooksImpl implements ActionBooks {

    private static final Logger logger
            = LoggerFactory.getLogger(ActionBooksImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Books> getAllBooks() {
        List<Books> books = new LinkedList<Books>();
//       Session session = sessionFactory.openSession();
        String hql = "FROM Books";
//       Query query = session.createQuery(hql);
//       books = query.list();
        logger.info("*************************************** book list:: " + books);
        books = sessionFactory.getCurrentSession().createQuery(hql).list();
        return books;
    }

    @Override
    @Transactional
    public void insertBook(Books book) {
        sessionFactory.getCurrentSession().save(book);
    }

    @Override
    @Transactional
    public void deleteBook(Integer bookId) {
        String hql = "DELETE from Books B WHERE B.id = :book_id";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("book_id", bookId);
        query.executeUpdate();
        System.out.println("delete book in dao " + bookId + "==============================================");
    }

    @Override
    @Transactional
    public Books findBookById(Integer id) {
        String hql = "SELECT b FROM Books b WHERE b.id = :id";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        Books book = (Books) query.uniqueResult();
        return book;
    }

    @Override
    @Transactional
    public void editBook(Books books) {
        sessionFactory.getCurrentSession().update(books);
    }

}

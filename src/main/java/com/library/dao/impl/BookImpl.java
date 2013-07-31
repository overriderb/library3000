package com.library.dao.impl;

import com.library.dao.BookDao;
import com.library.domain.Book;
import com.library.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 23.07.13
 * Time: 14:05
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class BookImpl implements BookDao {
    @Override
    public void addBook(Book book) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(book);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}

package com.library.dao.impl;

import com.library.dao.LibraryDao;
import com.library.domain.Library;
import com.library.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 23.07.13
 * Time: 14:03
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class LibraryImpl implements LibraryDao {

    @Override
    public void addLibrary(Library library) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(library);
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

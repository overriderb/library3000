package com.library.dao.impl;

import com.library.dao.CommentDAO;
import com.library.domain.Comment;
import com.library.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 23.07.13
 * Time: 14:05
 * To change this template use File | Settings | File Templates.
 */
public class CommentImpl implements CommentDAO {
    @Override
    public void addComment(Comment comment) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(comment);
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

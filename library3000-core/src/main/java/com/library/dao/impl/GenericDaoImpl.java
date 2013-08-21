package com.library.dao.impl;

import com.library.dao.GenericDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;

/**
 * TODO: Add class description
 *
 * User: override
 * Date: 21.08.13
 * Time: 12:42
 */
public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

    private Class<T> type;
    private SessionFactory sessionFactory;

    protected GenericDaoImpl(Class<T> type) {
        this.type = type;
    }

    @Override
    public PK create(T newInstance) {
            return (PK) getSession().save(newInstance);
    }

    @Override
    public T read(PK id) {
        return (T) getSession().get(type, id);
    }

    @Override
    public void update(T transientObject) {
        getSession().update(transientObject);
    }

    @Override
    public void delete(T persistentObject) {
        getSession().delete(persistentObject);
    }

    private Session getSession(){
        return sessionFactory.openSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

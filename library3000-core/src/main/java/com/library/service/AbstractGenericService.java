package com.library.service;

import com.library.dao.GenericDao;

import java.io.Serializable;
import java.util.List;

/**
 * TODO: Add class description
 * <p/>
 * User: override
 * Date: 22.08.13
 * Time: 17:03
 */
abstract class AbstractGenericService<T, PK extends Serializable> {

    private GenericDao<T, PK> dao;

    protected AbstractGenericService(GenericDao<T, PK> dao) {
        this.dao = dao;
    }

    public PK save(T object) {
        return dao.create(object);
    }

    public T read(PK id) {
        return dao.read(id);
    }

    public void update(T object) {
        dao.update(object);
    }

    public void delete(T object) {
        dao.delete(object);
    }

    public List<T> readAll() {
        return dao.readAll();
    }
}

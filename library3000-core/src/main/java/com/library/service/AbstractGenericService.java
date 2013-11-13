package com.library.service;

import com.library.dao.GenericDao;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public PK save(T object) {
        return dao.create(object);
    }

    @Transactional
    public T read(PK id) {
        return dao.read(id);
    }

    @Transactional
    public void update(T object) {
        dao.update(object);
    }

    @Transactional
    public void delete(T object) {
        dao.delete(object);
    }

    @Transactional
    public List<T> readAll() {
        return dao.readAll();
    }
}

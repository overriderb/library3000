package com.library.service;

import com.library.dao.GenericDao;
import com.library.domain.Book;

/**
 * TODO: Add class description
 * <p/>
 * User: override
 * Date: 22.08.13
 * Time: 16:59
 */
public class BookService extends AbstractGenericService<Book, Long> {

    protected BookService(GenericDao<Book, Long> bookLongGenericDao) {
        super(bookLongGenericDao);
    }
}

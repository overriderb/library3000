package com.library.service;

import com.library.dao.GenericDao;
import com.library.domain.Library;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
public class LibraryService extends AbstractGenericService<Library, Long> {

    protected LibraryService(GenericDao<Library, Long> libraryLongGenericDao) {
        super(libraryLongGenericDao);
    }
}

package com.library.service;

import com.library.dao.GenericDao;
import com.library.domain.Library;

/**
 * Implementation of library service
 * <p/>
 * @author Viktor_Khvostov
 */
public class LibraryService extends AbstractGenericService<Library, Long> {

    protected LibraryService(GenericDao<Library, Long> libraryLongGenericDao) {
        super(libraryLongGenericDao);
    }
}

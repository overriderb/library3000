package com.library.service;

import com.library.dao.GenericDao;
import com.library.domain.Library;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
public class LibraryService {

    private GenericDao<Library, Long> libraryDao;

    public LibraryService() {
    }

    public Long saveLibrary(Library library) {
        return libraryDao.create(library);
    }

    public void setLibraryDao(GenericDao<Library, Long> libraryDao) {
        this.libraryDao = libraryDao;
    }
}

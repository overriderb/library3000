package com.library.service;

import com.library.dao.LibraryDao;
import com.library.domain.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
@Service
public class LibraryService {

    @Autowired
    private LibraryDao libraryDao;

    public LibraryService() {
    }

    /*public Library getLibrary() {
        return libraryDao.readLibrary();
    }*/
}

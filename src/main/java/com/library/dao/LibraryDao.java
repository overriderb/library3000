package com.library.dao;

import com.library.model.Library;
import org.springframework.stereotype.Repository;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
@Repository
public class LibraryDao {

    public LibraryDao() {
    }

    public Library readLibrary() {
        return new Library();
    }
}

package com.library.dao.impl;

import com.library.dao.BookDao;
import com.library.dao.CommentDao;
import com.library.dao.LibraryDao;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24.07.13
 * Time: 11:00
 * To change this template use File | Settings | File Templates.
 */
public class Factory {
    private static LibraryDao libraryDao = null;
    private static BookDao bookDao = null;
    private static CommentDao commentDao = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public LibraryDao getLibraryDao(){
        if (libraryDao == null){
            libraryDao = new LibraryImpl();
        }
        return libraryDao;
    }
    public BookDao getBookDAO(){
        if (bookDao == null){
            bookDao = new BookImpl();
        }
        return bookDao;
    }

    public CommentDao getCommentDAO(){
        if(commentDao == null){
            commentDao = new CommentImpl();
        }
        return commentDao;
    }
}

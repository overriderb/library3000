package com.library.dao.impl;

import com.library.dao.BookDAO;
import com.library.dao.CommentDAO;
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
    private static BookDAO bookDAO = null;
    private static CommentDAO commentDAO = null;
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
    public BookDAO getBookDAO(){
        if (bookDAO == null){
            bookDAO = new BookImpl();
        }
        return bookDAO;
    }

    public CommentDAO getCommentDAO(){
        if(commentDAO == null){
            commentDAO = new CommentImpl();
        }
        return commentDAO;
    }
}

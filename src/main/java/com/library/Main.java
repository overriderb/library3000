package com.library;

import com.library.dao.impl.Factory;
import com.library.domain.Book;
import com.library.domain.Library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24.07.13
 * Time: 11:02
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String args[]){
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("title", "author", 0, "descr"));
        Library lib1 = new Library(bookList);

        lib1.setName("test");

        Factory.getInstance().getLibraryDao().addLibrary(lib1);




    }
}

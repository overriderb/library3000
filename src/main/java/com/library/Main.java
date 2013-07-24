package com.library;

import com.library.dao.impl.Factory;
import com.library.domain.Book;
import com.library.domain.Comment;
import com.library.domain.Library;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24.07.13
 * Time: 11:02
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String args[]){
        Library lib1 = new Library();
        Library lib2 = new Library();
        lib1.setLibraryId(Long.valueOf("3"));
        lib2.setLibraryId(Long.valueOf("4"));
        lib1.setName("name1");
        lib2.setName("name2");
        Factory.getInstance().getLibraryDao().addLibrary(lib1);

        /*Book book = new Book();
        book.setBookId(Long.valueOf("3"));
        book.setAuthor("1");
        book.setDescription("des");
        book.setPageNumbers(120);
        book.setTitle("123");
        book.setLibraryId(Long.valueOf("3"));

        Factory.getInstance().getBookDAO().addBook(book);*/

        Comment comment = new Comment();
        comment.setBookId(Long.valueOf("1"));
        comment.setCommentId(Long.valueOf("1"));
        comment.setComment("comment");
        Factory.getInstance().getCommentDAO().addComment(comment);


    }
}

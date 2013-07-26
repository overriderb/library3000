package com.library;

import com.library.dao.impl.Factory;
import com.library.domain.Book;
import com.library.domain.Comment;
import com.library.domain.Library;
import com.library.domain.Rating;

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
        Book book1 = new Book("UnderGround", "Teterin", 150, "about group");
        Book book2 = new Book("Java in action", "Shild", 750, "about java");
       // book1.setBookId(Long.valueOf("100"));
       // book2.setBookId(Long.valueOf("101"));
        book1.setLibraryId(Long.valueOf("101"));
        book2.setLibraryId(Long.valueOf("101"));
        bookList.add(book1);
        bookList.add(book2);
        Library lib1 = new Library();

        lib1.setName("myLibrary");
        lib1.setLibraryId(Long.valueOf("101"));
        lib1.setBooks(bookList);


        //Factory.getInstance().getLibraryDao().addLibrary(lib1);







        Comment comment = new Comment("test comment");
       // comment.setCommentId(Long.valueOf("2"));

        book1.addComment(comment);
        //comment.setRating(Rating.FIVE_STAR);
       // Factory.getInstance().getCommentDAO().addComment(comment);

        //Factory.getInstance().getBookDAO().addBook(book);
        //Factory.getInstance().getBookDAO().addBook(book1);
        Factory.getInstance().getLibraryDao().addLibrary(lib1);





    }
}

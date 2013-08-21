package com.library;

import com.library.dao.impl.Factory;
import com.library.domain.Book;
import com.library.domain.Comment;
import com.library.domain.Library;
import com.library.domain.Rating;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24.07.13
 * Time: 11:02
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String args[]){
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("classpath*:application-context.xml");
        Main main = (Main) appContext.getBean("main");
        main.testFromMainForAndrey();
    }

    //TODO: use for test - tests :)
    public void testFromMainForAndrey() {
        Library lib1 = new Library();
        lib1.setName("myLibrary");

        Book book1 = new Book(lib1, "UnderGround", "Teterin", 150, "about group");
        Book book2 = new Book(lib1, "Java in action", "Shild", 750, "about java");

        Comment comment = new Comment("test comment");
        comment.setBook(book1);
        Rating fiveStar = Rating.getFiveStar();
        fiveStar.addComment(comment);
        comment.setRating(fiveStar);

        book1.addComment(comment);

        lib1.addBook(book1);
        lib1.addBook(book2);

//        libraryDao.addLibrary(lib1);
        Factory.getInstance().getLibraryDao().addLibrary(lib1);
    }
}

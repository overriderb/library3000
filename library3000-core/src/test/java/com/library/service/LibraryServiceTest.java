package com.library.service;

import com.library.domain.Book;
import com.library.domain.Comment;
import com.library.domain.Library;
import com.library.domain.Rating;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-config.xml")
public class LibraryServiceTest {

    @Autowired
    LibraryService libraryService;

    // TODO: Make not! fake test
//    @Ignore
    @Test
//    @Rollback
    public void testSaveLibrary() throws Exception {
        Library lib1 = new Library();
        lib1.setName("myLibrary!!!");

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

        libraryService.save(lib1);
    }
}

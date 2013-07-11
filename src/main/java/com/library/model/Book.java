package com.library.model;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
public class Book {

    final private String title;
    final private String author;
    final private int pageNumbers;
    final private String description;

    private List<Comment> comments;

    public Book(final String title, final String author, final int pageNumbers, final String description) {
        this.title = title;
        this.author = author;
        this.pageNumbers = pageNumbers;
        this.description = description;
        this.comments = new ArrayList<Comment>();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public String getDescription() {
        return description;
    }

    public List<Comment> getComments() {
        return comments;
    }
}

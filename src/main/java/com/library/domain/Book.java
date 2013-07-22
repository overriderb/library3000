package com.library.domain;

import org.hibernate.annotations.Entity;

import javax.persistence.Column;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
@Entity
@Table(name="Book")
public class Book {

    final private String title;
    final private String author;
    final private int pageNumbers;
    final private String description;
    private int id;
    private int libId;

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

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    @Column(name="author")
    public String getAuthor() {
        return author;
    }

    @Column(name="pageNumbers")
    public int getPageNumbers() {
        return pageNumbers;
    }

    @Column(name="description")
    public String getDescription() {
        return description;
    }

    @Column(name="id")
    public int getId(){
        return id;
    }

    @Column(name="libId")
    public int getLibId(){
        return libId;
    }

    @OneToMany
    @JoinTable(name = "id")
    public List<Comment> getComments() {
        return comments;
    }
}

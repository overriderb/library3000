package com.library.domain;

import org.hibernate.annotations.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
@Entity
@Table(name="Comment")
public class Comment {

    private String comment;
    private Rating rating;
    private int id;
    private int bookId;

    public Comment(String comment, Rating rating, int id, int bookId) {
        this.comment = comment;
        this.rating = rating;
        this.id = id;
        this.bookId = bookId;
    }
    @Column(name="comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    @Column(name="rating")
    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
    @Column(name="id")
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    @Column(name="bookId")
    public int getBookId(){
        return bookId;
    }

    public void setBookId(int bookId){
        this.bookId = bookId;
    }
}

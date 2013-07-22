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

    private Long commentId;
    private Long bookId;
    private String comment;
    private Rating rating;

    public Comment() {
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
    @Column(name="commentId")
    public Long getCommentId(){
        return commentId;
    }

    public void setCommentId(Long commentId){
        this.commentId = commentId;
    }
    @Column(name="bookId")
    public Long getBookId(){
        return bookId;
    }

    public void setBookId(Long bookId){
        this.bookId = bookId;
    }
}

package com.library.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


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

    public Comment(String comment){
        this.comment = comment;
    }


    /*@OneToOne
    @JoinTable(name = "rating")
    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }*/
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
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
    /*@ManyToOne
    @JoinTable(name = "bookId")*/
    public void setBookId(Long bookId){
        this.bookId = bookId;
    }
    @Column(name="comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

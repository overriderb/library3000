package com.library.domain;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
public class Comment {

    private String comment;
    private Rating rating;

    public Comment(String comment, Rating rating) {
        this.comment = comment;
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}

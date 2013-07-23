package com.library.domain;

import javax.persistence.Column;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
public enum Rating {

    ONE_STAR(1,"*"),
    TWO_STAR(2, "**"),
    THREE_STAR(3, "***"),
    FOUR_STAR(4, "****"),
    FIVE_STAR(5, "*****");

    private final String rating;
    private int ratingId;

    private Rating(int ratingId, String rating) {
        this.rating = rating;
        this.ratingId = ratingId;
    }
    @Column(name="rating")
    public String getRating() {
        return rating;
    }
    @Column(name="ratingId")
    public int getRatingId(){
        return ratingId;
    }
}

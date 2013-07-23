package com.library.domain;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
public enum Rating {

    ONE_STAR("*"),
    TWO_STAR("**"),
    THREE_STAR("***"),
    FOUR_STAR("****"),
    FIVE_STAR("*****");

    private final String rating;

    private Rating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
}

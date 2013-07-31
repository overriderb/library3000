package com.library.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
@Entity
@Table(name = "rating")
public class Rating {

    private static final String ONE_STAR = "*";
    private static final String TWO_STAR = "**";
    private static final String THREE_STAR = "***";
    private static final String FOUR_STAR = "****";
    private static final String FIVE_STAR = "*****";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ratingId", unique = true, nullable = false)
    private int ratingId;

    @Column(name = "rating", nullable = false)
    private String rating;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "rating", cascade = CascadeType.ALL)
    private Set<Comment> comments;

    Rating() {
        comments = new HashSet<Comment>();
    }

    private Rating(String rating) {
        this.rating = rating;

        comments = new HashSet<Comment>();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public String getRating() {
        return rating;
    }

    public int getRatingId(){
        return ratingId;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public static Rating getOneStar() {
        return new Rating(ONE_STAR);
    }

    public static Rating getTwoStar() {
        return new Rating(TWO_STAR);
    }

    public static Rating getThreeStar() {
        return new Rating(THREE_STAR);
    }

    public static Rating getFourStar() {
        return new Rating(FOUR_STAR);
    }

    public static Rating getFiveStar() {
        return new Rating(FIVE_STAR);
    }
}

package com.library.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
@Entity
@Table(name="Book")
public class Book {

    private Long bookId;
    private Long libraryId;
    private String title;
    private String author;
    private int pageNumbers;
    private String description;

    /*private List<Comment> comments;*/

    public Book(){

    }

    public Book(final String title, final String author, final int pageNumbers, final String description) {
        this.title = title;
        this.author = author;
        this.pageNumbers = pageNumbers;
        this.description = description;
        /*this.libraryId = libraryId;*/
        /*this.comments = new ArrayList<Comment>();*/
    }

    /*public void addComment(Comment comment) {
        comments.add(comment);
    }*/

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name="pageNumbers")
    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    @Column(name="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Id
/*    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")*/
    @Column(name="bookId")
    public Long getBookId(){
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Column(name="libraryId")
    public Long getLibraryId(){
        return libraryId;
    }

    public void setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
    }

    /*@OneToMany
    @JoinTable(name = "bookId")
    public List<Comment> getComments() {
        return comments;
    }*/

   /* public void setComments(List<Comment> comments) {
        this.comments = comments;
    }*/
}

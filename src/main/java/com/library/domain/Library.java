package com.library.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
@Entity
@Table(name="Library")
public class Library {

    private Long libraryId;
    private String name;

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Book", joinColumns = @JoinColumn(name = "libraryId"),
            inverseJoinColumns = @JoinColumn(name = "bookId"))
    public List<Book> getBooks() {
        return books;
    }

    public void setLibraryId(Long libraryId){
        this.libraryId = libraryId;
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="libraryId")
    public Long getLibraryId(){
        return libraryId;
    }

    public void setName(String name){
        this.name = name;
    }

    @Column(name="name")
    public String getName(){
        return name;
    }
}

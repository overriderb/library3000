package com.library.domain;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

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

    /*private List<Book> books;*/

   /* public Library() {
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

    @OneToMany(targetEntity = Book.class)
    @JoinTable(name = "libraryId")
    public List<Book> getBooks() {
        return books;
    }*/

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

package com.library.domain;

import org.hibernate.annotations.Entity;

import javax.persistence.Column;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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

    private List<Book> books;
    private String name;
    private int id;

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

    @OneToMany
    @JoinTable(name = "id")
    public List<Book> getBooks() {
        return books;
    }

    public void setId(int id){
        this.id = id;
    }

    @Column(name="id")
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    @Column(name="name")
    public String getName(){
        return name;
    }
}

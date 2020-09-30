package com.example.springmysql;

import javax.persistence.*;

@Entity // says that this class will be an entity in the database
@Table(name = "books")
public class Book {

    @Id // says that the id is the primary key
    @GeneratedValue
    private Long id;

    private String name;

    private String author;

    private String Isbn;

    protected Book() {
    }

    public Book(String name, String author, String isbn) {
        this.name = name;
        this.author = author;
        this.Isbn = isbn;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public String getIsbn() {
        return this.Isbn;
    }

    public void setIsbn(String newIsbn) {
        this.Isbn = newIsbn;
    }

}

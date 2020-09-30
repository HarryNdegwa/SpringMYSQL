package com.example.springmysql;

@SuppressWarnings("serial")
public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(Long id) {
        super("Could not find a book with given id " + id);
    }
}

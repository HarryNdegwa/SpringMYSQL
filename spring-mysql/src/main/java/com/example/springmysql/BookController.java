package com.example.springmysql;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository repository) {
        this.bookRepository = repository;
    }

    @GetMapping("/books")
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@RequestBody Book bookDetails, @PathVariable Long id) {
        Book updatingBook = bookRepository.findById(id).orElseThrow(() -> BookNotFoundException(id));

        updatingBook.setName(bookDetails.getName());
        updatingBook.setAuthor(bookDetails.getAuthor());
        updatingBook.setIsbn(bookDetails.getIsbn());

        return bookRepository.save(updatingBook);

    }

}

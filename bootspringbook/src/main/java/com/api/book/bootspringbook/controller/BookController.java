package com.api.book.bootspringbook.controller;

import java.util.List;
import java.util.Optional;

import com.api.book.bootspringbook.entities.Books;
import com.api.book.bootspringbook.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Books>> getBooks() {

        /*
         * Books book = new Books(); book.setId(123); book.setTitle("Java");
         * book.setAuthor("Venkatesh");
         */

        List<Books> list = bookService.getAllBooks();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
        return ResponseEntity.of(Optional.of(list));
    }

    // get book by id
    @GetMapping("/books/{id}")
    public ResponseEntity<Books> getBook(@PathVariable("id") int id) {
        Books book = bookService.getBookById(id);
        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    // create
    @PostMapping("/books")
    public ResponseEntity<Books> addBooks(@RequestBody Books book) {
        Books b = null;
        try {
            b = this.bookService.addBooks(book);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @DeleteMapping("/books/{bookid}")
    public ResponseEntity<Void> deleteBook(@PathVariable("bookid") int bookid) {
        try {
            this.bookService.deleteBook(bookid);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    // update
    @PutMapping("books/{bookid}")
    public ResponseEntity<Books> updateBooks(@RequestBody Books book, @PathVariable("bookid") int bookid) {
        try {
            this.bookService.updateBooks(book, bookid);
            return ResponseEntity.ok().body(book);
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

}
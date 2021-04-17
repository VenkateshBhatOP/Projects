package com.api.book.bootspringbook.services;

import java.util.List;
import com.api.book.bootspringbook.dao.BookRepository;
import com.api.book.bootspringbook.entities.Books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    /*
     * private static List<Books> list = new ArrayList<>();
     * 
     * static { list.add(new Books(11, "Java complete guide", "abc")); list.add(new
     * Books(21, "Head first java", "def")); list.add(new Books(31, "Think wise",
     * "xyz"));
     */
    // }

    // get all books
    public List<Books> getAllBooks() {
        List<Books> list = (List<Books>) this.bookRepository.findAll();
        return list;

    }

    // get a single book

    public Books getBookById(int id) {

        Books book = null;
        try {
            book = this.bookRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        return book;
    }

    // add books

    public Books addBooks(Books b) {
        // list.add(b);
        Books result = bookRepository.save(b);
        return result;
    }

    // delete

    public void deleteBook(int bid) {
        bookRepository.deleteById(bid);
        // list = list.stream().filter(book -> book.getId() !=
        // bid).collect(Collectors.toList());
    }

    // update

    public void updateBooks(Books book, int bookid) {
        /*
         * list.stream().map(b -> { if (b.getId() == bookid) {
         * b.setTitle(book.getTitle()); b.setAuthor(book.getAuthor()); } return b;
         * }).collect(Collectors.toList());
         */
        book.setId(bookid);
        bookRepository.save(book);

    }

}

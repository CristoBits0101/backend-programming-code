package com.example.demo.controller;

import com.example.demo.entities.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // 1. Create
    // En la Request en el body del JSON recibe un objeto y es un objeto book quien lo recibe.
    @PostMapping("/setBook")
    public ResponseEntity<?> saveBook(@RequestBody Book book @RequestHeader httpHeaders headers) {
        try {
            Book savedBook = bookRepository.save(book);
            return ResponseEntity.ok(savedBook);
        }

        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving book: " + e.getMessage());
        }
    }

    // 2. Read
    @GetMapping("/getBooks")
    public ResponseEntity<List<Book>> findAll() {
        try {
            List<Book> books = bookRepository.findAll();
            return ResponseEntity.ok(books);
        }

        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // 3. Update
    @PutMapping("/updateBook/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        try {
            if (bookRepository.existsById(id)) {

                updatedBook.setId(id);
                Book savedBook = bookRepository.save(updatedBook);

                return ResponseEntity.ok(savedBook);
            }

            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book not found!");
            }
        }

        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error updating book: " + e.getMessage());
        }
    }

    // 4. Delete
    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        try {
            bookRepository.deleteById(id);
            return ResponseEntity.ok("Successfully deleted book!");
        }

        catch (EmptyResultDataAccessException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book not found!");
        }

        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting book: " + e.getMessage());
        }
    }
}

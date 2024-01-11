package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		// 1. Instantiate
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		BookRepository bookRepository = context.getBean(BookRepository.class);

		// 2. Create
		Book book = new Book(
				null,
				"Otaku book",
				"Cristo",
				289,
				8.75,
				LocalDate.of(2023, 12, 18),
				true
		);

		bookRepository.save(book);

		// 3. Read
		Long bookId = 1L;

		bookRepository.findById(bookId);

		System.out.println("Number of books: " + bookRepository.findAll().size());

		// 4. Update
		Book updatedBook = bookRepository.getReferenceById(bookId);

		updatedBook.setTitle("Gamer book");
		updatedBook.setAuthor("Rubén");

		// 5. Delete
		bookRepository.deleteById(1L);
		bookRepository.deleteAll();
	}
}

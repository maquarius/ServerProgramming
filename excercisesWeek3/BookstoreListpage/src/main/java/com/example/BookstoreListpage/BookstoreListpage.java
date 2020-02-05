package com.example.BookstoreListpage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.BookstoreListpage.domain.Book;
import com.example.BookstoreListpage.domain.BookRepository;

@SpringBootApplication
public class BookstoreListpage {
	private static final Logger log = LoggerFactory.getLogger(BookstoreListpage.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreListpage.class, args);
	}
	
	@Bean
	public CommandLineRunner addBooks(BookRepository repository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("Bible", "Jezus", 10, 12341245, 420.69));
			repository.save(new Book("Harry Potter", "J.K. Rowling", 2002, 439853785, 20.65));	
			repository.save(new Book("Kalle Anka", "Tove Jansen", 1994, 15341245, 12.45));	
			
			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}

}

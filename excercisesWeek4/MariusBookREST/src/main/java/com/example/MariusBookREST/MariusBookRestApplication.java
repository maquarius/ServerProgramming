package com.example.MariusBookREST;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.MariusBookREST.domain.Book;
import com.example.MariusBookREST.domain.BookRepository;
import com.example.MariusBookREST.domain.Category;
import com.example.MariusBookREST.domain.CategoryRepository;

@SpringBootApplication
public class MariusBookRestApplication {
	private static final Logger Log = LoggerFactory.getLogger(MariusBookRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MariusBookRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository brepository, CategoryRepository crepository) {
		return (args) -> {
			Log.info("save a couple of books");
			crepository.save(new Category("Fiction"));
			crepository.save(new Category("Culture"));

			brepository.save(new Book("Bible", "Jezus", 10, 12341245, crepository.findByName("Fiction").get(0)));
			brepository.save(new Book("Harry Potter", "J.K. Rowling", 2002, 439853785,
					crepository.findByName("Fiction").get(0)));
			brepository.save(
					new Book("Kalle Anka", "Tove Jansen", 1994, 15341245, crepository.findByName("Culture").get(0)));

			Log.info("fetch all books");
			for (Book book : brepository.findAll()) {
				Log.info(book.toString());
			}
			
		};

	}
}

package com.example.bookstoreWithMaria.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Long> {
	Optional<Book> findById(Long bookId);
}

package com.example.BookstoreAddJPAandDatabase.domain;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Long> {

}

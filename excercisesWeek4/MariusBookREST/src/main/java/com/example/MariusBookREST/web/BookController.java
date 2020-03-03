package com.example.MariusBookREST.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MariusBookREST.domain.Book;
import com.example.MariusBookREST.domain.BookRepository;
import com.example.MariusBookREST.domain.CategoryRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository brepository;

	@Autowired
	private CategoryRepository crepository;

	// RESTful service to get all students
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public @ResponseBody List<Book> bookListRest() {
		return (List<Book>) brepository.findAll();
	}

	// RESTful service to get student by id
	@RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Book> findBookRest(@PathVariable("id") Long bookId) {
		return brepository.findById(bookId);
	}

}

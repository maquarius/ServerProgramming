package com.example.BookstoreListpage.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.BookstoreListpage.domain.Book;
import com.example.BookstoreListpage.domain.BookRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository repository;

	@RequestMapping(value={"/booklist", "/"}, method = RequestMethod.GET)
	public String getBooks(Model model) {
		model.addAttribute("book", repository.findAll());
				return "booklist";
	}
}	

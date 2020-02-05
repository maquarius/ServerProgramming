package com.example.BookstoreAddJPAandDatabase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.BookstoreAddJPAandDatabase.domain.Book;
import com.example.BookstoreAddJPAandDatabase.domain.BookRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository repository;

	@RequestMapping(value={"/index", "/"}, method = RequestMethod.GET)
	public String getBooks(Model model) {
		model.addAttribute("book", repository.findAll());
				return "index";
	}
}	

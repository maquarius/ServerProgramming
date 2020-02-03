package com.example.Bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Bookstore.domain.Book;

@Controller
public class BookController {

	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String getBooks(Model model) {
		model.addAttribute("book", new Book("Harry Potter","J.K. Rowling", 2003,1391238123, 23.50));
		return "index";
	}
}	

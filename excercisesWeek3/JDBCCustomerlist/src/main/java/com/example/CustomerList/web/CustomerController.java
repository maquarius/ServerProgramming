package com.example.CustomerList.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.CustomerList.domain.CustomerRepository;

@Controller
public class CustomerController {
	@Autowired
	private CustomerRepository repository;
	
	@RequestMapping(value = {"customer", "/"}, method = RequestMethod.GET)
	public String getCustomers (Model model) {
		model.addAttribute("customer", repository.findAll());
		return "customerlist";
	}
	
}

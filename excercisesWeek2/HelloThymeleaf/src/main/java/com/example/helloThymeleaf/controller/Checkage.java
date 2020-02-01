package com.example.helloThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Checkage {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String ageCheck(@RequestParam(value = "age") int age, @RequestParam(value = "name") String name,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "Checkage";
	}
}

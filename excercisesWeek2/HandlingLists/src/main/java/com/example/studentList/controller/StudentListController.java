package com.example.studentList.controller;

import java.util.ArrayList;
import java.util.List;
import com.example.studentList.domain.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentListController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String students(Model model) {

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Kate", "Cole"));
		studentList.add(new Student("Dan", "Brown"));
		studentList.add(new Student("Mike", "Mars"));
		
		String message = "Welcome to the Haaga-Helia!";
		model.addAttribute("studentList", studentList);
		model.addAttribute("message", message);
		
		return "students";
	}
}

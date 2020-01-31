package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloControler {

	@RequestMapping("/hello")
	public String hello(@RequestParam(name="name", required=false, defaultValue="Marius")String name,@RequestParam(value="location", required=false, defaultValue="Moon") String location) {
		return "Welcome to the " + location + " " + name + " !";
	}
}

package com.example.jdbcCustomerList2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class studentController {

	@RequestMapping("/hello")
	public String Hello() {
		return "hello";
	}
}

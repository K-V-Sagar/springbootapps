package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	// runs on 
	// http://localhost:8085/hello
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello World";
	}
	
	// runs on
	// http://localhost:8085/greet?name=sagar
	
	@RequestMapping("/greet")
	@ResponseBody
	public String greet(@RequestParam String name) {
		return "Hello " + name;
	}
	
}
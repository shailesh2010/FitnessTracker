package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContoller {

	@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		
		model.addAttribute("Greeting","Hello World");
		return "hello";
	}
}

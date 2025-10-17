package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class Controller {
	
	
	@GetMapping("/home")
	public String demo() {
		return "home page";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login page";
	}
	

}

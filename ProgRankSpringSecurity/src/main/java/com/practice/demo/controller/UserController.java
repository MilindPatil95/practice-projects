package com.practice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
   @GetMapping("/getData") 
	public String getUser() {
		return "user data fetch";
	}
	
}

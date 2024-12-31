package com.practice.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Home {

	@GetMapping("/world")
	public String welcome() {
		return "JWT Working";
	}
}

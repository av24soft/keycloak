package com.avsoft.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/helloUser")
	public String helloUser()
	{
		
		return "helloUser";
	}
	
	@GetMapping("/helloAdmin")
	public String helloAdmin()
	{
		
		return "helloAdmin";
	}
	
}

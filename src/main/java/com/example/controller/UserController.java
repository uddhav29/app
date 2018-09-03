package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.User;

@RestController
public class UserController {
	
	@GetMapping(value="welcome/user")
	public String getUserName(@RequestParam(name="name")String name) {
		
		//implementation of project
		return "Welcome to GCP "+name;
	}
	
	@RequestMapping(method=RequestMethod.POST ,value="welcome/post")
	public String getPostName(/*@RequestParam(name = "key")String name,*/ @RequestBody User user) {
		
		System.out.println(user);
		return "post call - "+user;
	}
	
	
	

}

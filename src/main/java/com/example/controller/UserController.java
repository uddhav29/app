package com.example.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.User;
@Validated
@RestController
public class UserController {
	//Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping(value="welcome/user")
	public String getUserName(@RequestParam(name="name")String name) {
		
		//implementation of project
//		logger.info("Inside hello controller "+name);
		return "Welcome to hardcoders demo, "+name;
	}
	
	@RequestMapping(method=RequestMethod.POST ,value="welcome/post")
	public String getPostName(/*@RequestParam(name = "key")String name,*/ @RequestBody @Valid User user) {
		
		System.out.println(user);
		return "post call - "+user;
	}
	
	
	

}

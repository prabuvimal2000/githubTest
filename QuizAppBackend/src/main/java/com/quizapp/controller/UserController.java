package com.quizapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quizapp.dto.Login;
import com.quizapp.model.User;
import com.quizapp.service.UserService;

@RestController
@RequestMapping("api/quizapp")
public class UserController 
{
	// Create the userService reference to perform operations in repository
		 @Autowired
		  private UserService userService;
		
		 
    //Collect the details from user and fetch that into database
		@RequestMapping(value="/register",method=RequestMethod.POST)
		  public String saveUser(@RequestBody User newUser)
		  {
			  return  userService.saveUser(newUser);
		  }
		
     //Collect login details from user and check this details with database to give access
		@RequestMapping(value = "/login",method=RequestMethod.POST)
		public String login(@RequestBody Login login) {
			return userService.login(login);
		}
		
}

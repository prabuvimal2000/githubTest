package com.quizapp.service;

import com.quizapp.dto.Login;
import com.quizapp.model.User;

public interface UserService 
{

	String saveUser(User newUser);

	User findByUserName(String userName);

	String login(Login loginDetails);
	
}

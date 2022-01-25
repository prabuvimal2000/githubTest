package com.quizapp.serviceimplement;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.quizapp.dao.UserRepository;
import com.quizapp.dto.Login;
import com.quizapp.model.User;
import com.quizapp.service.UserService;

@Service
public class UserServiceImplementation implements UserService
{
	@Autowired
	   UserRepository userRepository;
	
	 //To secure the user password through BcryptpasswordEncoder 
	 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
     
	 public static boolean validateUserData(String userData,String userDataConstraint)
	 {
		 if(Pattern.matches(userDataConstraint,userData))
		 {
			 return true;
		 }
		 return false;
	 }
	 
	 public static String validateRegisterUser(User newUser)
	 {
		    String userName,userPassword,userMobileNumber,userEmailAddress;
			String userNameContains,userMobileNumContains,userEmailAddressContains,userPasswordContains;
			boolean isUserNameContainsSpecialCharacter,isUserEmailAddressValid,isUserPasswordValid,isUserMobileNumberValid;
			userName =newUser.getUserName().trim();
			userMobileNumber = newUser.getMobileNumber();
			userPassword=newUser.getPassWord();
			userEmailAddress=newUser.getEmailAddress();
			userNameContains = "[\\sa-zA-z]+";
			userMobileNumContains="[0-9]+";
			userEmailAddressContains="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			userPasswordContains="[[\\w]+^A-Za-z0-9]+{6}";
			isUserNameContainsSpecialCharacter=validateUserData(userName,userNameContains);
			isUserPasswordValid=validateUserData(userPassword,userPasswordContains);
			isUserEmailAddressValid=validateUserData( userEmailAddress,userEmailAddressContains);
			isUserMobileNumberValid=validateUserData(userMobileNumber,userMobileNumContains);
			if(!(isUserNameContainsSpecialCharacter))
			{
				return "Please enter the valid username";
			}
			if (isUserPasswordValid)
			{
				return "Please make sure the length is greater than 6 and \nit must contain a mix of letters, numbers, and/or special characters";
			}
			if(!(isUserEmailAddressValid))
			{
				return "Please enter the valid emailAddress";
			}
			if(!(isUserMobileNumberValid))
			{
				return "Please enter the valid mobileNumber";
			}
			if(userMobileNumber.length()<10 || userMobileNumber.length()>10)
			{
				return "The mobile number should be in 10-digits";
			}
			return null;
	 }
	 
	 
		// save the new user details 
		@Override
		public String saveUser(User newUser) 
		{
			// To check whether the user is already registered or not 
			String registerdUserEmail = newUser.getEmailAddress();
			if(findByUserName(registerdUserEmail)==null)
			{
				     String isUserValidateDetails = validateRegisterUser(newUser);
				     if(isUserValidateDetails==null)
				     {
					     String userPassword=newUser.getPassWord();
						//To secure the user detail encrypt the password
					     String encodedPassword = passwordEncoder.encode(userPassword);
					     newUser.setPassWord(encodedPassword);
						 userRepository.save(newUser);
						 return "Registered Succesfully" ;
				     }
				     else
				     {
				    	 return isUserValidateDetails;
				     }
				     
			}
			   return "Your already registred \nPlease login to continue" ;
		}
		
		
		
		@Override
		public User findByUserName(String userName) {
			return userRepository.findUserByEmailAddress(userName);
		}

		@Override
		public String login(Login loginDetails)
		{
			String userEmailAddress=loginDetails.getEmailAddress().trim();
			String userPassword=loginDetails.getPassWord().trim(); 
			User alreadyUser =(User)findByUserName(userEmailAddress);
			if(alreadyUser!=null)
			{
				String registerdUserEmail=alreadyUser.getEmailAddress();
				String  registerdUserPassword=alreadyUser.getPassWord();
				if( registerdUserEmail.equalsIgnoreCase(userEmailAddress)&&passwordEncoder.matches(userPassword,registerdUserPassword))
				{		
					return "Login Successfully";
				}
				else
				{
					return "Please enter the correct password";
				}
			}
			return "Please enter the registered emailAddress";
		}


}

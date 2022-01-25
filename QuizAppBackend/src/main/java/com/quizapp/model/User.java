//Create User table 
package com.quizapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="UserDetails")
public class User
{
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
	@GenericGenerator(name = "user_generator",strategy="com.quizapp.model.StringPrefixedSequenceIdGenerator",
			parameters= {
			@Parameter(name=StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value = "1"),
			@Parameter(name=StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value = "user"),
			@Parameter(name=StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value = "%04d")
	})
	private String userId;
	
	@Column(nullable=false)
	private String userName;
	
	@Column(nullable=false)
	private String emailAddress;
	
	@Column(nullable=false)
	private String passWord;
	
	@Column(nullable=false)
    private String mobileNumber;

	
	public User() {
		super();
	}

	public User(String userName, String emailAddress, String passWord, String mobileNumber) {
		super();
		this.userName = userName;
		this.emailAddress = emailAddress;
		this.passWord = passWord;
		this.mobileNumber = mobileNumber;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}

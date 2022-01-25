package com.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quizapp.dto.QuestionLevelRequest;
import com.quizapp.service.QuestionComplexityLevelService;

@RestController
@RequestMapping("api/quizapp")
public class QuestionComplexityLevelController 
{
	
	@Autowired
	private QuestionComplexityLevelService questionLevelService;
	
	@RequestMapping(value="/add-levels",method=RequestMethod.POST)
	public String insertLevels(@RequestBody QuestionLevelRequest complexityLevel) 
    { 
		
		System.out.println(complexityLevel.getQuestionComplexityLevel());
		return questionLevelService.saveComplexityLevel(complexityLevel);
	}
	
	@RequestMapping(value="/complexity-levels",method=RequestMethod.GET)
	public ResponseEntity<List<String>> showComplexityLevels()
	{
         return new ResponseEntity<> (questionLevelService.showComplexityLevels(),HttpStatus.OK);
	}
	
 }
	

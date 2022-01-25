package com.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.quizapp.dto.QuestionsFileRequest;
import com.quizapp.model.QuestionComplexityLevel;
import com.quizapp.model.SubCategories;
import com.quizapp.service.CategoryService;
import com.quizapp.service.QuestionComplexityLevelService;
import com.quizapp.service.QuestionsService;

@RestController
@RequestMapping("api/quizapp")
public class QuestionsController 
{
  @Autowired
  private QuestionsService questionsService;
	
  @Autowired
  private CategoryService categoryService;
  
  @Autowired 
  private QuestionComplexityLevelService questionLevelService;
  
	@RequestMapping(value="/{subCategoryName}/{questionLevel}/upload-questions",method=RequestMethod.POST)
	 public String uploadFile(@RequestParam("file") MultipartFile file,@PathVariable String subCategoryName,@PathVariable String questionLevel) 
	 {
		subCategoryName=subCategoryName.substring(0, 1).toUpperCase() + subCategoryName.substring(1);
		questionLevel=questionLevel.substring(0, 1).toUpperCase() + questionLevel.substring(1);
		SubCategories subcategory =(SubCategories)categoryService.findSubCategoriesBySubCategoryName(subCategoryName);
		QuestionComplexityLevel questionLevels = (QuestionComplexityLevel)questionLevelService.findQuestionComplexityLevelByQuestionComplexityLevel(questionLevel);
	    String message="";
//		if (QuestionsFileRequest.convertExcelToJson(file)) 
//	    {
	      try {
	    	questionsService.saveFile(file,questionLevels,subcategory);
	        message = "Uploaded the file successfully: " + file.getOriginalFilename();
	        return message;
	      } 
	      catch (Exception e) 
	      {
	        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	        return message;
	      }
//	    }
//	    message = "Please upload a csv file!";
//	    return message;
	  }
	
	@RequestMapping(value="/{subCategoryName}/{questionLevel}/questions",method=RequestMethod.PATCH)
	 public ResponseEntity<List<String>> getQuestions(@PathVariable String subCategoryName,@PathVariable String questionLevel) 
	 {
		subCategoryName=subCategoryName.substring(0, 1).toUpperCase() + subCategoryName.substring(1);
		questionLevel=questionLevel.substring(0, 1).toUpperCase() + questionLevel.substring(1);
		SubCategories subcategory =(SubCategories)categoryService.findSubCategoriesBySubCategoryName(subCategoryName);
		QuestionComplexityLevel questionLevels = (QuestionComplexityLevel)questionLevelService.findQuestionComplexityLevelByQuestionComplexityLevel(questionLevel);
		if(subcategory!=null&&questionLevels!=null)
		{
			return new ResponseEntity<> (questionsService.showQuestion(subcategory,questionLevels),HttpStatus.OK);
		}
		else
		{
			return null;
		}
		
	 }
	
}

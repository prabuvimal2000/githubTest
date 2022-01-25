package com.quizapp.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.quizapp.model.QuestionComplexityLevel;
import com.quizapp.model.SubCategories;



public interface QuestionsService 
{
	void saveFile(MultipartFile file,QuestionComplexityLevel questionLevel,SubCategories subCategoryName);

	List<String> showQuestion(SubCategories subcategory, QuestionComplexityLevel questionLevels);

}

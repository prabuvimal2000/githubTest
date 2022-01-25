package com.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizapp.model.QuestionComplexityLevel;
import com.quizapp.model.Questions;
import com.quizapp.model.SubCategories;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, String> 
{

	List<Questions> findQuestionsByQuestionComplexityLevel(QuestionComplexityLevel questionLevel);

	List<Questions> findQuestionsBySubCategory(SubCategories subCategoryName);
	
	List<Questions> findQuestionsBySubCategoryAndQuestionComplexityLevel(SubCategories subCategoryName,QuestionComplexityLevel questionLevel);
   
}

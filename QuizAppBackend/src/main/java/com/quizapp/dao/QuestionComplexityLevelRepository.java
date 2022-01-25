package com.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizapp.model.QuestionComplexityLevel;

@Repository
public interface QuestionComplexityLevelRepository extends JpaRepository<QuestionComplexityLevel,String>
{

	QuestionComplexityLevel findQuestionComplexityLevelByQuestionComplexityLevel(String questionLevel);

}

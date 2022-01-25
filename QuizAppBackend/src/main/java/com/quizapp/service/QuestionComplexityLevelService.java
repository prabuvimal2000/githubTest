package com.quizapp.service;

import java.util.List;

import com.quizapp.dto.QuestionLevelRequest;
import com.quizapp.model.QuestionComplexityLevel;

public interface QuestionComplexityLevelService {

	String saveComplexityLevel(QuestionLevelRequest complexityLevel);

	QuestionComplexityLevel findQuestionComplexityLevelByQuestionComplexityLevel(String questionLevel);

	List<String> showComplexityLevels();


}

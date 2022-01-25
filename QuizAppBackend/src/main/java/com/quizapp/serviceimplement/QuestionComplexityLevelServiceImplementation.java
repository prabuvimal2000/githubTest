package com.quizapp.serviceimplement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizapp.dao.QuestionComplexityLevelRepository;
import com.quizapp.dto.QuestionLevelRequest;
import com.quizapp.model.QuestionComplexityLevel;
import com.quizapp.service.QuestionComplexityLevelService;

@Service
public class QuestionComplexityLevelServiceImplementation implements QuestionComplexityLevelService
{

	@Autowired
	private QuestionComplexityLevelRepository questionLevelRepository;

	@Override
	public QuestionComplexityLevel findQuestionComplexityLevelByQuestionComplexityLevel(String questionLevel) {
		return questionLevelRepository.findQuestionComplexityLevelByQuestionComplexityLevel(questionLevel);
	}

	@Override
	public String saveComplexityLevel(QuestionLevelRequest complexityLevel) 
	{
		String questionComplexityLevel = complexityLevel.getQuestionComplexityLevel();
		System.out.println(questionComplexityLevel);
		QuestionComplexityLevel questionLevel = (QuestionComplexityLevel) findQuestionComplexityLevelByQuestionComplexityLevel(questionComplexityLevel);
		if(questionLevel==null)
		{
			questionLevelRepository.save(new QuestionComplexityLevel(questionComplexityLevel));
			return "Level created Successfully";
		}
		else
		{
			return "This leavel is already created";
		}
	}

	@Override
	public List<String> showComplexityLevels() 
	{
		List<QuestionComplexityLevel> complexityLevels = questionLevelRepository.findAll();
		List<String> complexityLevelList = new ArrayList<String>();
		for(QuestionComplexityLevel complexityLevel:complexityLevels) 
		{
			complexityLevelList.add(complexityLevel.getQuestionComplexityLevel());
		}
		return complexityLevelList;
	}


}

package com.quizapp.serviceimplement;

import java.io.IOException;
import java.util.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.quizapp.dao.QuestionsRepository;
import com.quizapp.dto.QuestionsFileRequest;
import com.quizapp.model.Category;
import com.quizapp.model.QuestionComplexityLevel;
import com.quizapp.model.Questions;
import com.quizapp.model.SubCategories;
import com.quizapp.service.QuestionsService;


@Service
public class QuestionsServiceImplementation implements QuestionsService 
{
	 @Autowired
	  QuestionsRepository questionsrepository;

	 public int[] uniQuestions(int noOfQuestions)
	 {
		int[] questionNumber = new int[noOfQuestions];
		for(int i=0;i<noOfQuestions;i++)
		{
			questionNumber[i]=i;
		}
		int[] randomQuestionNumber = new int[noOfQuestions];
		int randomNumber = noOfQuestions;
		SecureRandom randomNumberGenerate = new SecureRandom();
		for(int i=0;i<noOfQuestions;i++)
		{
			int number = randomNumberGenerate.nextInt(randomNumber);
			randomQuestionNumber[i]= questionNumber[number];
			questionNumber[number]= questionNumber[randomNumber-1];
			randomNumber--;
		}
		return randomQuestionNumber;
		 
	 }
	 
	  public void saveFile(MultipartFile file,QuestionComplexityLevel questionComplexityLevel,SubCategories subcategory) {
//	    try {
//	      List<Questions> questions = QuestionsFileRequest.csvQuestionFileUpload(file.getInputStream(),questionComplexityLevel,subcategory);
//	      questionsrepository.saveAll(questions);
//	    } 
//	    catch (IOException e) 
//	    {
//	      throw new RuntimeException("fail to store csv data: " + e.getMessage());
//	    }
		  try
		  {
			  List<Questions> questions = QuestionsFileRequest.jsonFormatUpload(file.getInputStream(), questionComplexityLevel, subcategory);
			  List<String> jsonString = QuestionsFileRequest.convertObjects2JsonString(questions,questionComplexityLevel, subcategory);
			  //questionsrepository.saveAll(questions);
		  }
		  catch(IOException exception)
		  {
			  throw new RuntimeException(exception.getMessage());
		  }
	  }

	@Override
	public List<String> showQuestion(SubCategories subCategoryName,QuestionComplexityLevel questionLevel)
	{
		
		List<Questions> questions =questionsrepository.findQuestionsBySubCategoryAndQuestionComplexityLevel(subCategoryName, questionLevel);
		//System.out.println(questionComplexityLevel.getQuestionComplexityLevel());
	     Questions generatedRandomQuestion = new Questions();
	     List<Questions> randomQuestions = new ArrayList<>();
		//List<String> randomQuestions = new ArrayList<> ();
		int noOfQuestions =questions.size();
		if(noOfQuestions!=0)
		{
			int[] randomQuestion = uniQuestions(noOfQuestions);
			String userAnswer;
			for(int i=0;i<noOfQuestions;i++)
			{
				randomQuestions.add(questions.get(randomQuestion[i]));
			}
			System.out.println("\n"+randomQuestions.get(0));
			int score=0;
				for(Questions question :randomQuestions)
				{
					System.out.println(question.getQuestion());
					System.out.println(question.getOptA());
					System.out.println(question.getOptB());
					System.out.println(question.getOptC());
					System.out.println(question.getOptD());
					System.out.println("Enter your Answer :");
					Scanner input = new Scanner(System.in);
					 userAnswer=input.next();
					if(userAnswer.equals(question.getAnswer()))
					{
						System.out.println("Correct answer");
						score++;
					}
				    
				}
				System.out.println("Total Score: "+score);
		}
		return null;
	}
}

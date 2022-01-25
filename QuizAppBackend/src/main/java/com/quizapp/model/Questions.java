package com.quizapp.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Questions
{
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questionid_generator")
   @GenericGenerator(name = "questionid_generator",strategy="com.quizapp.model.StringPrefixedSequenceIdGenerator",
	parameters= {
	@Parameter(name=StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value = "1"),
	@Parameter(name=StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value = "q"),
	@Parameter(name=StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value = "%03d")
})
   @Column(name="Question_Id",nullable=false)
   private String questionId;
   
   @Column(name="Question_No",nullable=false)
   private int questionNumber;
   
   @Column(nullable=false)
   private String question;
   
   private String optA;
   
   private String optB;
  
   private String optC;
   
   private String optD;
   
   @Column(nullable=false)
   private String answer;
   
   @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
   @JoinColumn(name="subCategory_Id")
  	private SubCategories subCategory;
   
   @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="level_Id")
	private QuestionComplexityLevel questionComplexityLevel;
   
   public Questions() 
	{
		
	}

	public Questions(int questionNumber, String question, String optA, String optB, String optC, String optD,
		String answer) {
	this.questionNumber = questionNumber;
	this.question = question;
	this.optA = optA;
	this.optB = optB;
	this.optC = optC;
	this.optD = optD;
	this.answer = answer;
}

	

	public Questions(int questionNumber, String question, String optA, String optB, String optC, String optD,
			String answer, SubCategories subCategory, QuestionComplexityLevel questionComplexityLevel) {
		super();
		this.questionNumber = questionNumber;
		this.question = question;
		this.optA = optA;
		this.optB = optB;
		this.optC = optC;
		this.optD = optD;
		this.answer = answer;
		this.subCategory = subCategory;
		this.questionComplexityLevel = questionComplexityLevel;
	}

	public SubCategories getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategories subCategory) {
		this.subCategory = subCategory;
	}

	public QuestionComplexityLevel getQuestionComplexityLevel() {
		return questionComplexityLevel;
	}

	public void setQuestionComplexityLevel(QuestionComplexityLevel questionComplexityLevel) {
		this.questionComplexityLevel = questionComplexityLevel;
	}

	public int getQuestionNumber() {
		return questionNumber;
	}
	
	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getOptA() {
		return optA;
	}
	
	public void setOptA(String optA) {
		this.optA = optA;
	}
	
	public String getOptB() {
		return optB;
	}
	
	public void setOptB(String optB) {
		this.optB = optB;
	}
	
	public String getOptC() {
		return optC;
	}
	
	public void setOptC(String optC) {
		this.optC = optC;
	}
	
	public String getOptD() {
		return optD;
	}
	
	public void setOptD(String optD) {
		this.optD = optD;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Questions [questionNumber=" + questionNumber + ", question=" + question
				+ ", optA=" + optA + ", optB=" + optB + ", optC=" + optC + ", optD=" + optD + ", answer=" + answer
				+ ", subCategory=" + subCategory+ ", questionComplexityLevel=" + questionComplexityLevel+ "]";
	}


//
//	@Override
//	public String toString() {
//		return "Questions [questionNo="+ questionNumber+",question=" + question + ", optA=" + optA + ", optB=" + optB + ", optC=" + optC + ", optD="
//				+ optD + ", answer=" + answer + "]";
//	}
}

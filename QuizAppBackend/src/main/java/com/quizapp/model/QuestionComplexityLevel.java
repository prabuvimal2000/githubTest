package com.quizapp.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class QuestionComplexityLevel {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "levels_generator")
	@GenericGenerator(name = "levels_generator",strategy="com.quizapp.model.StringPrefixedSequenceIdGenerator",
			parameters= {
			@Parameter(name=StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value = "1"),
			@Parameter(name=StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value = "lev"),
			@Parameter(name=StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value = "%03d")
	})
	@Column(name="Complexity_Level_Id")
    @Id
    private String levelId;
	
	@Column(name="Complexity_Level",nullable=false,unique=false)
	private String questionComplexityLevel;
	
	
	@OneToMany(mappedBy="questionComplexityLevel")
	private List<Questions> questions;

	
	public QuestionComplexityLevel() {
	}

	public QuestionComplexityLevel(String questionComplexityLevel) {
		this.questionComplexityLevel = questionComplexityLevel;
	}

	public String getLevelId() {
		return levelId;
	}

	public String getQuestionComplexityLevel() {
		return questionComplexityLevel;
	}

	public void setQuestionComplexityLevel(String questionComplexityLevel) {
		this.questionComplexityLevel = questionComplexityLevel;
	}

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}

//	@Override
//	public String toString() {
//		return "QuestionComplexityLevel [questionComplexityLevel=" + questionComplexityLevel
//				+ "]";
//	}
	
	
}

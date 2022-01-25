package com.quizapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class SubCategories 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subcategory_generator")
	@GenericGenerator(name = "subcategory_generator",strategy="com.quizapp.model.StringPrefixedSequenceIdGenerator",
	parameters= {
			@Parameter(name=StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value ="1"),
			@Parameter(name=StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value = "subcat"),
			@Parameter(name=StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value = "%04d")
	})
	private String subCategoryId;
	
	@Column(nullable=false,unique=true)
	private String subCategoryName;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="category_id")
	private Category category;
	
	@OneToMany(mappedBy="subCategory")
	private List<Questions> questions;
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
//
//	@Override
//	public String toString() {
//		return "SubCategories [subCategoryName=" + subCategoryName + "]";
//	}


	
	
}

package com.quizapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;

@Entity
@Table(name="Categories")

//@SequenceGenerator(name = "category_generator", sequenceName = "category_sequence", initialValue=1000,allocationSize = 1)
public class Category 
{
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_generator")
	@GenericGenerator(name = "category_generator",strategy="com.quizapp.model.StringPrefixedSequenceIdGenerator",
			parameters= {
			@Parameter(name=StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value = "1"),
			@Parameter(name=StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value = "cat"),
			@Parameter(name=StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value = "%03d")
	})
	@Id
	private String categoryId;
	
	@Column(nullable=false)
	private String categoryName;
	
	//@OneToMany(mappedBy="category")
	@OneToMany(mappedBy="category")
	private List<SubCategories> subcategories;

	public String getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + "]";
	}
	
	
}

package com.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quizapp.dto.CategoryRequest;
import com.quizapp.model.Category;
import com.quizapp.model.SubCategories;
import com.quizapp.service.CategoryService;


@RestController
@RequestMapping("api/quizapp")
public class CategoryController 
{
 
	@Autowired
	 private CategoryService categoryService;
	
	@RequestMapping(value="/add-categories",method=RequestMethod.POST)
	  public String saveCategory(@RequestBody Category newCategory)
	  {
		 categoryService.saveCategory(newCategory);
		  return "Category Created Successfully";
	  }
	
	@RequestMapping(value="/{categoryName}/add-sub-categories",method=RequestMethod.POST)
	  public String saveSubCategory(@RequestBody CategoryRequest newSubCategory,@PathVariable String categoryName )
	  {
		SubCategories subcategory= new SubCategories();
		String subCategoryName=newSubCategory.getSubCategoryName();
		categoryName=categoryName.substring(0, 1).toUpperCase() + categoryName.substring(1);
		Category category =(Category)categoryService.findCategoryByCategoryName(categoryName);
	    String alreadyCategoryName= category.getCategoryName();
		   if(categoryName.equalsIgnoreCase(alreadyCategoryName))
		   {
			   subcategory.setSubCategoryName(subCategoryName);
			   subcategory.setCategory(category);
			   categoryService.saveSubCategory(subcategory);
			   return "SubCategory Created Successfully";
		   }
		   else
		   {
		       return "Unable to create the subcategory please ensure the category is created or not";
		   }		
	  }
	@RequestMapping(value="/categories",method=RequestMethod.GET)
	public ResponseEntity<List<String>> showCategories()
	{
		 //List<String> listOfCategories =categoryService.showCategoriesName();
         return new ResponseEntity<> (categoryService.showCategoriesName(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/sub-categories",method=RequestMethod.GET)
	public ResponseEntity<List<String>> showSubCategories()
	{
		 //List<String> listOfCategories =categoryService.showCategoriesName();
         return new ResponseEntity<> (categoryService.showSubCategoriesName(),HttpStatus.OK);
	}
}

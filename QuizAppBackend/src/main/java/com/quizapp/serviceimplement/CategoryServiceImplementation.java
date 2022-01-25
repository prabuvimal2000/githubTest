package com.quizapp.serviceimplement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizapp.dao.CategoriesRepository;
import com.quizapp.dao.SubCategoriesRepository;
import com.quizapp.model.Category;
import com.quizapp.model.SubCategories;
import com.quizapp.service.CategoryService;

@Service
public class CategoryServiceImplementation implements CategoryService 
{
	@Autowired
	private CategoriesRepository categoryRepository;
	
	@Autowired
	private SubCategoriesRepository subCategoryRepository;

	@Override
	public Category saveCategory(Category newCategory) 
	{
		return categoryRepository.save(newCategory);
	}

	@Override
	public SubCategories saveSubCategory(SubCategories newSubCategory) 
	{
		return subCategoryRepository.save(newSubCategory) ;
	}

	@Override
	public Category findCategoryByCategoryName(String catName) {
		return categoryRepository.findCategoryByCategoryName(catName);
	}

	@Override
	public SubCategories findSubCategoriesBySubCategoryName(String subCategoryName) 
	{
		return subCategoryRepository.findSubCategoriesBySubCategoryName(subCategoryName);
	}

	@Override
	public List<String> showCategoriesName() 
	{
		List<Category> categoriesName = categoryRepository.findAll();
		List<String> categoryNameList = new ArrayList<String>();
		for(Category categoryName:categoriesName) 
		{
			categoryNameList.add(categoryName.getCategoryName());
		}
		return categoryNameList;
	}

	@Override
	public List<String> showSubCategoriesName()
	{
		List<SubCategories> subCategoriesName = subCategoryRepository.findAll();
		List<String> subCategoriesNameList = new ArrayList<String>();
		for(SubCategories subCategoryName:subCategoriesName) 
		{
			subCategoriesNameList.add(subCategoryName.getSubCategoryName());
		}
		return subCategoriesNameList;
	}
		

}

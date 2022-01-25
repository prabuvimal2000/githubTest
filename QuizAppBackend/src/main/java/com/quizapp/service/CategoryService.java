package com.quizapp.service;


import java.util.List;

import com.quizapp.model.Category;
import com.quizapp.model.SubCategories;

public interface CategoryService {

	Category saveCategory(Category newCategory);

	SubCategories saveSubCategory(SubCategories newSubCategory);

	Category findCategoryByCategoryName(String catName);

	SubCategories findSubCategoriesBySubCategoryName(String subCategoryName);

	List<String> showCategoriesName();

	 List<String> showSubCategoriesName();


}

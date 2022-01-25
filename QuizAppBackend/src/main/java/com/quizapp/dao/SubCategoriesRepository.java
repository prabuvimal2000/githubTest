package com.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizapp.model.SubCategories;

@Repository
public interface SubCategoriesRepository extends JpaRepository<SubCategories,String>
{

	SubCategories findSubCategoriesBySubCategoryName(String subCategoryName);
   
}

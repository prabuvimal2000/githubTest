package com.quizapp.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizapp.model.Category;

@Repository
public interface CategoriesRepository extends  JpaRepository<Category, String>//CrudRepository<Category,String>
{
	Category findCategoryByCategoryName(String categoryName);
}

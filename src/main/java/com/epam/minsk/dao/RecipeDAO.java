package com.epam.minsk.dao;

import java.util.List;

import com.epam.minsk.bean.Recipe;

public interface RecipeDAO {
	
	List<Recipe> findAll();
	boolean createRecipe();
	boolean updateRecipe();
	boolean deleteRecipe();
	Recipe find();

}

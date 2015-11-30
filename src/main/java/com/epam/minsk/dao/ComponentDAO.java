package com.epam.minsk.dao;

import java.util.List;

import com.epam.minsk.bean.Component;

public interface ComponentDAO {
	
	List<Component> findAll();
	boolean createRecipe();
	boolean updateRecipe();
	boolean deleteRecipe();
	Component find();

}

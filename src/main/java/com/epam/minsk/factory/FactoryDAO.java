package com.epam.minsk.factory;

import com.epam.minsk.dao.ComponentDAO;
import com.epam.minsk.dao.RecipeDAO;

public interface FactoryDAO {
	RecipeDAO getRecipeDAO();
	ComponentDAO getComponentDAO();
}

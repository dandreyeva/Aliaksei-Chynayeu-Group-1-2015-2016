package com.epam.minsk.factory;

import com.epam.minsk.dao.ComponentDAO;
import com.epam.minsk.dao.RecipeDAO;
import com.epam.minsk.daoxml.ComponentDAOXML;
import com.epam.minsk.daoxml.RecipeDAOXML;

public class FactoryDAOXML implements FactoryDAO {

	@Override
	public RecipeDAO getRecipeDAO() {
		return new RecipeDAOXML();
	}

	@Override
	public ComponentDAO getComponentDAO() {
		return new ComponentDAOXML();
	}

}

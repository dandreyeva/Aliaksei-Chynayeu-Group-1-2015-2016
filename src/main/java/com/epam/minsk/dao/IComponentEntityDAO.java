package com.epam.minsk.dao;

import java.util.List;

import com.epam.minsk.bean.Ingredient;

public interface IComponentEntityDAO {
	
	List<Ingredient> findAll();
	boolean create();
	boolean update();
	boolean delete();
	Ingredient find();

}

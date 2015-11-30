package com.epam.minsk.bean;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	
	private Long id;
	private String name;
	private List<Component> componentList = new ArrayList<Component>();
	private int rating;
	private String comment;
	private String description;
	private RecipeCategory category;
	
	public Recipe(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Component> getComponentList() {
		return componentList;
	}
	public void setComponentList(List<Component> componentList) {
		this.componentList = componentList;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public RecipeCategory getCategory() {
		return category;
	}

	public void setCategory(RecipeCategory category) {
		this.category = category;
	}
}

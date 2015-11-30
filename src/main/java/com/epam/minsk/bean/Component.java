package com.epam.minsk.bean;

public class Component {
	
	private Long id;
	private String name;
	private MeasureUnit measureUnit;
	private double quantity;
	
	public Component(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MeasureUnit getMesureUnit() {
		return measureUnit;
	}

	public void setMesureUnit(MeasureUnit measureUnit) {
		this.measureUnit = measureUnit;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	
}

package com.encapsulation;

public class ReadOnlyCar {
	private String modelName;
	private float price;
	
	ReadOnlyCar(){
		this.modelName = "readOnlyCar";
		this.price = 10000;
	}
	public String getModelName() {
		return modelName;
	}
	public float getPrice() {
		return price;
	}
}

package com.encapsulation;

public class EncapsulatedCar {
	private String modelName;
	private float price;
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) throws Exception {
		if(price <= 0) {
			throw new Exception("invalid price: "+ price);
		}
		this.price = price;
	}
}

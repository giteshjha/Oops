package com.inheritance;

public class AnimalBase {
	public String name;
	private String color;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	protected void sleep() {
		System.out.println(this.name+ "is sleeping...");
	}
	
	public void eat() {
		System.out.println(this.name+ "is eating...");
	}

//	public void className
}

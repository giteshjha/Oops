package com.inheritance;

public class AnimalOne {
	private String name;
	private String color;
	
	AnimalOne(String name, String color){
		setName(name);
		setColor(color);
	}
	
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

	public void sleep() {
		System.out.println(this.name+ "is sleeping...");
	}
	
	public void eat() {
		System.out.println(this.name+ "is eating...");
	}
	
	public void run() {
		System.out.println(this.name+ "is running...");
	}
}

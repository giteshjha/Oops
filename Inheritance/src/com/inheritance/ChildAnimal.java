package com.inheritance;

public class ChildAnimal extends AnimalBase{
	ChildAnimal(String name, String color){
		this.name = name;
		setColor(color);
	}
	
	public void sing() {
		System.out.println(this.getName() + " is Singing ...");
	}
	
//	public void sleep() {
//		System.out.println(this.name+ "is Not sleeping...");
//	}
}

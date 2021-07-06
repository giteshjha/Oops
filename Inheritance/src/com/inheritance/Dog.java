package com.inheritance;

public class Dog extends Animal{

	//See different ways to initialize the object
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "Dog";
		dog.color = "white";
		dog.eat();
		dog.bark();
	}
	
	public void bark() {
		System.out.println("==> "+name+" is barking...");
	}
}

package com.inheritance;

public class Cat extends Animal{
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name = "Cat";
		cat.color = "Black";
		cat.eat();
	}
}

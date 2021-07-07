package com.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AnimalOne animalOne = new AnimalOne("animalOne", "White");
//		animalOne.sleep();
//		
//		AnimalTwo animalTwo = new AnimalTwo("animalTwo", "White");
//		animalTwo.sleep();
//		animalTwo.fly();
		
		ChildAnimal childAnimal = new ChildAnimal("Child_Animal", "Yellow");
		childAnimal.sing();
		childAnimal.eat();
		childAnimal.sleep();
	}

}

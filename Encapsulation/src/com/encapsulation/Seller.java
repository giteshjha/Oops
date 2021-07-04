package com.encapsulation;

public class Seller {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.modelName = "M1";
		car.price = -100;
		System.out.println("modelName: "+car.modelName);
		System.out.println("price: "+car.price);
		
		EncapsulatedCar encapsulatedCar = new EncapsulatedCar();
		encapsulatedCar.setModelName("encapsulatedCar");
		encapsulatedCar.setPrice(10);
		
		System.out.println("modelName: "+encapsulatedCar.getModelName());
		System.out.println("price: "+encapsulatedCar.getPrice());
		
		ReadOnlyCar readOnlyCar = new ReadOnlyCar();
		System.out.println("modelName: "+readOnlyCar.getModelName());
		System.out.println("price: "+readOnlyCar.getPrice());
	}

}

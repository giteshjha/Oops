package com.encapsulation;

public class Seller {
	
	public static void setCarAttributes(Car car, String modelName, float price) throws Exception {
		car.modelName = modelName;
		if(price <= 0) {
			throw new Exception("invalid price: "+ price);
		}
		car.price = price;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Car car = new Car();
		setCarAttributes(car, "M1", -100);
		System.out.println("modelName: "+car.modelName);
		System.out.println("price: "+car.price);
		
//		EncapsulatedCar encapsulatedCar = new EncapsulatedCar();
//	
//		encapsulatedCar.setModelName("encapsulatedCar");
//		encapsulatedCar.setPrice(10);
//		
//		System.out.println("modelName: "+encapsulatedCar.getModelName());
//		System.out.println("price: "+encapsulatedCar.getPrice());
//		
//		ReadOnlyCar readOnlyCar = new ReadOnlyCar();
//		System.out.println("modelName: "+readOnlyCar.getModelName());
//		System.out.println("price: "+readOnlyCar.getPrice());
	}

}

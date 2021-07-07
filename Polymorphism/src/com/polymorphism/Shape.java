package com.polymorphism;

public class Shape {
	
	public void area(int side) {
		int area = 4*side;
		System.out.println("Area of Square is: "+ area); 
	}
	
	public void area(int length, int width) {
		int area = length*width;
		System.out.println("Area of rectangle is: "+ area); 
	}
	
	public void area(double length) {
		double area = length*length;
		System.out.println("Area of newShape is: "+ area); 
	}
}

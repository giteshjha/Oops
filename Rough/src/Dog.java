
public class Dog {

	String name;
	String color;
	
	Dog(String name, String color){
		this.name = name;
		this.color = color;
	}
	public void eat() {
		System.out.println("==> "+name+" is eating...");
	}
	
	public void bark() {
		System.out.println("==> "+name+" is barking...");
	}
	public static void main(String[] args) {
		Dog dog = new Dog("Dog", "white");
		dog.eat();
		dog.bark();
	}

}

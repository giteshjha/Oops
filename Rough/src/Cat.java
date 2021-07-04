
public class Cat {

	String name;
	String color;
	
	Cat(String name, String color){
		this.name = name;
		this.color = color;
	}
	public void eat() {
		System.out.println("==> "+name+" is eating...");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat("Cat", "white");
		cat.eat();
		
	}

}

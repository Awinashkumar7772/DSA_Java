package cdac;

class Car{
	String name;
	String color;
	int speed;
	
	void start() {
		System.out.println("Car is starting");
	}
	void drive() {
		System.out.println("Car is driving");
	}
}
public class Day02_Classes_Object {

	public static void main(String[] args) {
		// A class in java is a blueprint or template for creating objects.
		
		//Its defines properties(variables) and behaviors(methods).
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		//Assigning values to the object properties
		c1.name = "BMW";
		c1.color = "Grey";
		c1.speed = 320;
		
		c2.name = "BMW";
		c2.color = "Grey";
		c2.speed = 320;
		
		//calling the methods
		
		c1.start();
		c1.drive();
		
		
		

	}

}

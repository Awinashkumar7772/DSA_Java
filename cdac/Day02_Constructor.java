package cdac;
class Car1{
	String color;
	int speed;
	Car1(){
		color = "Black";
		speed = 320;
	}
	void show() {
		System.out.println(color + " "+ speed);
	}
}
public class Day02_Constructor {

	public static void main(String[] args) {
		 Car1 c1 = new Car1();
		 c1.show();

	}

}

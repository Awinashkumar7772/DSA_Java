package cdac;

import java.util.Scanner;

class Senior{
	String name;
	int age;
	 Senior(String name, int age) {
		this.name = name;
		this.age = age;
	}
	 
	
}
class Junior extends Senior{
	String clg;
	int std;

	 Junior(String name, int age, String clg,int std) {
		super(name, age);
		this.clg = clg;
		this.std = std;
	}
	
	 void displayJunior() {
		 System.out.println("Name:" +" "+ name);
		 System.out.println("Age:" + " " +age);
		 System.out.println("College"+" "+ clg);
		 System.out.println("Standard"+" "+std);
	 }
	
	
}

public class Day02_This_Super_Keywords_Inheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your junior details");
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your college");
		String clg = sc.next();
		System.out.println("Enter your standard");
		int std = sc.nextInt();
		
		Junior j1 = new Junior(name,age,clg,std);
		j1.displayJunior();

	}

}

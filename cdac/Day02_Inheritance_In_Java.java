package cdac;

import java.util.Scanner;

class Person{
	String name;
	int age;
	
	void inputPersonDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		 name = sc.next();
		System.out.println("Enter your age");
		 age = sc.nextInt();
	}
	
}
class Employee extends Person{
	String course;
	double marks;
	
	void inputEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your course");
		course = sc.next();
		System.out.println("enter your marks");
		marks = sc.nextDouble();
	}
	void getEmployeeDetails() {
		System.out.println("Here is your student details");
		System.out.println("Name"+ name);
		System.out.println("Age"+age);
		System.out.println("Course"+ course);
		System.out.println("Marks"+ marks);
	}
}

public class Day02_Inheritance_In_Java {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Employee e = new Employee();
		
		e.inputPersonDetails();
		e.inputEmployeeDetails();
		
		e.getEmployeeDetails();
		
		

	}

}

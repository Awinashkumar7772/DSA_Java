package cdac;

import java.util.Scanner;

public class Day03_Arrays {

	public static void main(String[] args) {
		//An array is collection of elements of the same type
		//Stored in a contiguous memory location
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size");
		int size = sc.nextInt();
		int [] arr = new int [size];		
		
	    System.out.println("Enter your numbers" );
	    for(int i=0;i<size;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    
	    for(int i =0;i<size;i++) {
	    	
	    	System.out.println(arr[i]);
	    }
	    sc.close();

	}

}

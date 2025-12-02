package practice;

import java.util.Scanner;

public class Day01_Array_DSA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the element of the array");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
					
		}
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
 for(int x:arr) System.out.println("Here is the array"+x);
 sc.close();
	}
	

}

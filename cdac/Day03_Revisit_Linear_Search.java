package cdac;

import java.util.Scanner;

public class Day03_Revisit_Linear_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the element of an array");
		int [] arr = new int [size];
		for(int i=0;i<size;i++) {
			arr[i] =sc.nextInt();
		}System.out.println("Enter the target element to search");
		int target = sc.nextInt();
		int pos = -1;
		for(int i =0;i<size;i++) {
			if(arr[i] ==target) {
				pos = i;
				break;
			}
			
		}
		if(pos!=-1) {
			System.out.println("Element found at index "+ " "+ pos);
		}
		else {
			System.out.println("Element not found in the array");
		}
		sc.close();
		
	}

}

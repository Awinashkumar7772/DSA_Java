package cdac;

import java.util.Scanner;

public class Day03_Linear_Search {

	public static void main(String[] args) {
		//Linear Search - It Checks every element of the array one by one until the target element is found
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the elements of arrays");
		for(int i =0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
       System.out.println("Enter the element to search");
       int target = sc.nextInt();
       int pos = -1;
       for(int i = 0;i<size;i++) {
    	    if(arr[i] ==target) {
    	    	pos = i;
    	    	break;
    	    }
       }
       if(pos!=-1) {
    	   System.out.println("Element found at index" +" " + pos);
    	   
       }
       else {
    	   System.out.println("Element not found");
       }
       sc.close();
	}
	

}

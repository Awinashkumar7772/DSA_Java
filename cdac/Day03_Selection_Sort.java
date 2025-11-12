package cdac;

import java.util.Scanner;

public class Day03_Selection_Sort {

	public static void main(String[] args) {
		//Selection Sort is a simple  sorting algorithm that repeatedly
		//select the smallest (or largest) element from the unsorted part of the array put its at beginning
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the element of array");
        int [] arr = new int[size];
        for(int i = 0;i<size;i++) {
        	arr[i]  = sc.nextInt();
        }
        //Selection sort logic
        for(int i = 0;i<size-1;i++) {
        	int minIndex = i;
        	for(int j = i+1;j<size;j++) {
        		if(arr[j]<arr[minIndex]) {
        		minIndex = j;
        		}
        	}
        	int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array");
        for(int num :arr) {
        	System.out.println(num + " ");
        }
        sc.close();
	}

}

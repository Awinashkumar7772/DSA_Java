package cdac;

import java.util.Scanner;

public class Day03_Sorting_bubble_Sort {

	public static void main(String[] args) {
		// Sorting means arranging elements in a particular order usually ascending
		// Bubble Sort repeatedly compares adjacent elements and swaps them if they are
		// in the wrong order
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size");
		int size = sc.nextInt();
		System.out.println("Enter your element of an array");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Array");
		for (int num : arr) {
			System.out.println(num + " ");
		}
		sc.close();
	}

}

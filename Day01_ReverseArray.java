package practice;

import java.util.Scanner;

public class Day01_ReverseArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n = sc.nextInt();
	int [] arr = new int[n];
	int left = 0;int right = arr.length-1;
	System.out.println("Enter the element of array");
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	while(left<right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
	}
	for(int x:arr) {
		System.out.println(x+ " ");
	}
sc.close();
	}

}

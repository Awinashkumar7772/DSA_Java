package cdac;

import java.util.Scanner;

public class Day03_Binary_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size  = sc.nextInt();
		System.out.println("Enter the elements of an array");
		int [] arr = new int [size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search");
		int target = sc.nextInt();
		int low = 0,high = size-1;
		int pos = -1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] ==target) {
				pos = mid;
				break;
			}else if(arr[mid]<target) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		if(pos!=-1) {
			System.out.println("Element found at index"+" "+pos);
			
		}else {
			System.out.println("element not found");
		}
		sc.close();

	}

}

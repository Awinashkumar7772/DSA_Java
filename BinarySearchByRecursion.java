import java.util.Scanner;

public class BinarySearchByRecursion {
	
	public static int function(int[] arr, int left, int right, int target) {
		int mid = (right+left)/2;
		
		if(left>right) {
			return -1;
		}
		
		if(arr[mid]==target) {
			return mid;
		}
		else if(target > arr[mid]) {
			return function(arr, mid+1, right, target);
		}
		else {
			return function(arr, left, mid-1, target);
		}

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println("Enter Target");
		int target = s.nextInt();
		
		int result = function(arr, 0, arr.length-1, target);
		if(result!=-1) {
			System.out.println("Element is at index: " + result);
		}
		else {
			System.out.println("Element not found");
		}
		s.close();
	}

}

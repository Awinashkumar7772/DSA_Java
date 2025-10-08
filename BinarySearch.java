public class BinarySearch {
	
	public static int function() {
		int[] arr = {1,2,3,4,5,6,7};
		int left = 0;
		int right = arr.length-1;
		int target = 11;
		
		while(left <= right) {
			int mid = (right+left)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			else if(target > arr[mid]) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int result = function();
		if(result!=-1) {
			System.out.println("Element at " + result);
		}
		else {
			System.out.println("Element not found");
		}
	}

}

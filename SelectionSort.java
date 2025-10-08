
public class SelectionSort {
	
	public static void function() {
		int[] arr = {5,6,3,9,7,1,2,0,8};
		int n = arr.length;
		int minIdx = 0;
		int temp = 0;
		int count = 0;
		
		
		for(int i=0; i<n; i++) {
			minIdx = i;
			
			for(int j=i+1; j<n; j++) {
				count++;
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
		
		for(int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println("count is : " + count);
		
	}
	
	public static void main(String[] args) {
		function();
	}

}

import java.util.Arrays;

public class Insertion {
	
	public static void main(String[] args) {
		int[] arr = {6,7,9,4,3,2};
		int key = 0;
		
		
		for(int i=1; i<arr.length; i++) {
			key = arr[i];
			int p = i-1;
			while(p>=0 && arr[p]>key) {
				arr[p+1] = arr[p]; 
				p--;
			}
			arr[p+1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}
}

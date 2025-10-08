import java.util.ArrayList;
import java.util.Collections;

public class bubbleSort {
	
	public static void function() {
		int temp = 0;
		int fourthLargest = 0;

		
		ArrayList<Integer> al = new ArrayList<>() ;
		al.add(1);
		al.add(2);
		al.add(5);
		al.add(6);
		al.add(8);
		
		for(int i=0; i<al.size()-1; i++) {
			if(al.get(i) < al.get(i+1)) {
				Collections.swap(al, i, i+1);
			}			
		}
		for(int e : al) {	
			System.out.print(e + " ");
		}
	}
	
	public static void main(String[] args) {
		function();
	}

}

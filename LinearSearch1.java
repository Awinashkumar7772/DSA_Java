
public class LinearSearch1 {
  public static void main(String[] args) {
	int arr[] = {23,43,45,67,78};
	int locate = 23;
	boolean found = false;
	for (int i = 0;i<arr.length;i++) {
		if(arr[i] == locate) {
			System.out.println("Found");
			found = true;
		}
		
	}
	if (found == false ) {
	System.out.println("not found");
	}
}
}

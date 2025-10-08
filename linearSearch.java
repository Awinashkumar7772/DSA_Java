public class linearSearch {
	
	public static void main(String[] args) {
		int[] arr = {12, 43, 54, 76, 89};
		int locate = 12;
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==locate) {
				System.out.println("You have found the element " + arr[i] + " at "
						+ i);
				found = true;
			}
		}
		if(found == false) {
			System.out.println("Not Found");
		}
	}

}

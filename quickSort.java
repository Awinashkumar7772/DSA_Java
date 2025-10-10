
public class quickSort {
	public static void main(String[] args) {
		// main method to test the quick sort
		int[] arr = { 34, 7, 23, 32, 5, 62 };
		System.out.println("Orginal Array");
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();

		QuickSort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void QuickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			QuickSort(arr, low, pivotIndex - 1);
			QuickSort(arr, pivotIndex + 1, high);
		}
	}

	
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	public static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

package dac;

class Merge {
    
    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;   // size of left subarray
        int n2 = right - mid;      // size of right subarray

        // Temporary arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays back into arr[]
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Before sorting:");
        for (int x : arr)
            System.out.print(x + " ");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter sorting:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}

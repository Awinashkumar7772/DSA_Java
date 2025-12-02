package practice;

import java.util.Scanner;

public class Day01_SecondMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > max) {
                second = max;
                max = x;
            } 
            else if (x > second && x != max) {
                second = x;
            }
        }

        System.out.println("Second largest number is: " + second);

        sc.close();
    }
}

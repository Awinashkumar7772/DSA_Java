package practice;

import java.util.Scanner;

public class Day01_FindMaxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] num = new int[n];
		int max = num[0];
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		System.out.println("This is the max element: "+max);
		sc.close();

	}

}

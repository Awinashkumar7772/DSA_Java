

import java.util.Scanner;

public class Fibonacci {
	
	static long[] arr = new long[100];
	
	public static long fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		else if(arr[(int)n]!=-1) {
			return arr[(int)n];
		}
		else {
			arr[n] = fib(n-1) + fib(n-2);
			return arr[(int)n];
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		long beforeCall = System.nanoTime();

		System.out.println("Enter value");
		int n = s.nextInt();
		System.out.println(fib(n) + " ");
		
		long afterCall = System.nanoTime();
		
		System.out.println("Time: " + (afterCall-beforeCall));
		
		
	}

}

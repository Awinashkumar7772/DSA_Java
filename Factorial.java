import java.util.Scanner;

public class Factorial {
	
	public static int fac(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n * fac(n-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		System.out.println(fac(n));
	}

}

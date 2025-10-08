import java.util.Scanner;

public class multiplication {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int t = 1;
		for(int i=0; i<10; i++) {
			System.out.println(n + " x " + t + "=" + (n*t));
			t++;
		}
		s.close();
	}

}

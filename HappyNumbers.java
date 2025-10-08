import java.util.HashSet;
import java.util.Scanner;

public class HappyNumbers {

	public static boolean isHappy(int n, int t) {
		HashSet<Integer> seen = new HashSet<>();
		int iteration = 0;
		t = n;

		while (n != 0 && !seen.contains(n)) {
			seen.add(n);
			n = square(n);
			iteration++;
		}

		if (n == 1) {
			System.out.println(t + " " + iteration);
			return true;
		} else {
			return false;
		}
	}

	public static int square(int n) {
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n2 = s.nextInt();

		int t = n;
		int check = n;
		for(int i=0; i<=(n2-n); i++) {
			isHappy(check, t);
			check++;
		}
		s.close();
	}
}

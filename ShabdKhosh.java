import java.util.Arrays;
import java.util.Scanner;

public class ShabdKhosh {
	// 8 whisper format perform sonnet person shopper workshop network
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = s.next();
		}
		boolean flag = false;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int num = 3;
				while (num < str[i].length() - 1) {
					if (str[i].substring(str[i].length() - num).equals(str[j].substring(0, num))) {
						flag = true;
						String temp = str[i + 1];
						str[i + 1] = str[j];
						str[j] = temp;
					}
					num++;
				}
			}
		}
		if(flag == true) {
			System.out.println(Arrays.toString(str));
		}
		else {
			System.out.println("IMPOSSIBLE");
		}
		s.close();
	}
}
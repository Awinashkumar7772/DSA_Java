import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of times you want to run the loop");
		int c = s.nextInt();
		
		while(c!=0) {
		System.out.println("Enter string 1");
        String s1 = s.next();
        System.out.println("Enter string 1");
        String s2 = s.next();
  
        String[][] arr = new String[s1.length()][s2.length()];
        
        int row = 0;
        int col = 0;
        
        for(int i=0; i<s1.length(); i++) {
        	for(int j=0; j<s2.length(); j++) {
        		arr[i][j] = "*";
        	}
        }
        boolean found = false;
        
        for(int i=0; i<s1.length(); i++) {
        	for(int j=0; j<s2.length(); j++) {
        		if(s1.charAt(i)==s2.charAt(j)) {
        			row = i;
        			col = j;
        			found = true;
        			break;
        		}
        	}
        	if(found == true) {
        	break;
        	}
        }
 
        for(int i=0; i<s1.length(); i++) {
        	arr[i][col] = s1.charAt(i)+"";
        }
        for(int i=0; i<s2.length(); i++) {
        	arr[row][i] = s2.charAt(i)+"";
        }
        
        for(int i=0; i<s1.length(); i++) {
        	for(int j=0; j<s2.length(); j++) {
        		System.out.print(arr[i][j] + " ");
        	}
        	System.out.println();
        }
	}
		s.close();
	}
}

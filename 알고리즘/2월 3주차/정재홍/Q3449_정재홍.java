package algorithmstudyBOJ;

import java.util.Scanner;

public class Q3449_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		

		for(int i=0;i<t;i++) {
			String a = sc.next();
			String b = sc.next();
			int cnt = 0;
			for(int j=0;j<a.length();j++) {;
				if(a.charAt(j)!=b.charAt(j)) {
					cnt++;
				}
			}
			System.out.println("Hamming distance is " + cnt + ".");	
		}
	}
}


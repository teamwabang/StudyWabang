package altudy;

import java.util.Scanner;

public class T_10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int a;
		int b;
		
		int i;		
		for(i = 1; i <= T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			int c = 0;
			c = a + b;
			System.out.println(c);
		}		

	}

}

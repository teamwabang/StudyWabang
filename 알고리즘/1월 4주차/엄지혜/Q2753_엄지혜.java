package test;

import java.util.Scanner;

public class B2753 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		if( N % 4 == 0 && (N % 100 != 0 || N % 400 == 0)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		in.close();
	}
}

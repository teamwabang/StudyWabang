package test;

import java.util.Scanner;

public class B1009 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int A,B,result;
		
		for(int j=0; j<t; j++) {
			A = in.nextInt();
			B = in.nextInt();
		    result = 1;
		
		for(int i=0; i<=B; i++) {
			result = result * A % 10;
		}
		
		if(result == 0) {
			result = 10;
		}
		System.out.println(result);
	}
		in.close();
		}
}

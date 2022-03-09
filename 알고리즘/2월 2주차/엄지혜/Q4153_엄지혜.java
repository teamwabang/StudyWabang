package test;

import java.util.Scanner;

public class B4153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			if(A == 0 && B == 0 && C == 0) break;
			
			if(C * C == (A * A + B * B)) {
				System.out.println("right"); 
			} else if(A * A == (B * B + C * C)) { 
				System.out.println("right"); 
			} else if(B * B == (C * C + A * A)) { 
				System.out.println("right"); 
			} else { 
				System.out.println("wrong"); 
				} 
			}	

	}

}

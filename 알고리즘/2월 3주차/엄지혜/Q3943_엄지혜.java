package test;

import java.util.Scanner;

public class B3943 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			
			int max = A;
			
			while(A != 1) {
			A = (A % 2 == 0) ? A / 2 : (A * 3) + 1;
			max = Math.max(max, A);

		}
			System.out.println(max);
	}
}
}

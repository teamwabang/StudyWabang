package test;

import java.util.Scanner;

public class B5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[31];
		
		for(int i = 1; i <= 28; i++) {
			int S = sc.nextInt();
			N[S] = 1;
		}
		for(int i = 1; i < 31; i++) {
			if(N[i] == 0)
				System.out.println(i);
		}
	}
}
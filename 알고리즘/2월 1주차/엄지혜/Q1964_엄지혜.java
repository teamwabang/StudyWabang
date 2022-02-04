package test;

import java.util.Scanner;

public class B1964 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long result = 5; 
		int A = 7; 
		
		for(int i = 1; i < N; i++) {
			result += A;
			A += 3;
			}
		
		System.out.println(result % 45678);
		sc.close();
		}
	}

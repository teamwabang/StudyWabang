package test;

import java.util.Scanner;

public class B1964 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int A = 3;
		int result = 5;
		
		for(int i = 2; i <= N; i++) {
			result += 5 * i - A;
			A += 2;
			}
		
		System.out.println(result % 45678);
		scanner.close();
		}
	}

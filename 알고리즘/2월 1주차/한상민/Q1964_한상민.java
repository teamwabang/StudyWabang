package algorithm;

import java.util.Scanner;

public class Q1964_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = 5;
		for(int i = 1; i < n; i++) {
			result = (result + (i + 2) * 3 - 2) % 45678;
		}
		System.out.println(result);
		sc.close();
	}

}

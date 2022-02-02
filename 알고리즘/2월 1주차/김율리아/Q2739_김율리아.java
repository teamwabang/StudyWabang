package backjoon;

import java.util.Scanner;

public class Q2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i = 1 ; i<=9; i++)
			System.out.println(a + " * " + i + " = " + a*i);

	}

}

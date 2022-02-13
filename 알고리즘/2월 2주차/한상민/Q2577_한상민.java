package algorithm;

import java.util.Scanner;

public class Q2577_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int temp = a * b * c;
		
		int result = temp;				// 3개의 값 곱셈을 result에 저장.
		int[] arr = new int[10];
		while(result > 0) {
			arr[result % 10]++;			// result % 10에 1을 더하고
			result = result / 10;		// result / 10을 result에 저장.
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}

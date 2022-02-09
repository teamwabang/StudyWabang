package algorithm;

import java.util.Scanner;

public class Q1110_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = n;
		int cnt = 0;
		
		while(true) {
			int a = result / 10;	// 십의 자리
			int b = result % 10;	// 일의 자리
			
			if(a >= 1) {
				result = (b * 10) + ((a + b) % 10);
				cnt++;
			} else {
				result = (b * 10) + b;
				cnt++;
			}
			if(n == result) {		// 초기값과 같으면 중단
				break;
			}
		}
		System.out.println(cnt);
		sc.close();
		
	}

}

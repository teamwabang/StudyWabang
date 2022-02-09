package algorithm;

import java.util.Scanner;

public class Q2783_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();						// X원
		int y = sc.nextInt();						// Y그램
		int n = sc.nextInt();						// 편의점 개수
		double result = (double)x / y * 1000;
		
		for(int i = 0; i < n; i++) {
			int xx = sc.nextInt();
			int yy = sc.nextInt();
			double result2 = (double)xx / yy * 1000;
			result = Math.min(result, result2);		// 계산한 값 중 저렴한 가격 저장
		}
		System.out.println(result);
		sc.close();
	}

}

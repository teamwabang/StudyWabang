package algorithm;

import java.util.Scanner;

public class Q5565_한상민 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int total = sc.nextInt();
//		int price1 = sc.nextInt();
//		int price2 = sc.nextInt();
//		int price3 = sc.nextInt();
//		int price4 = sc.nextInt();
//		int price5 = sc.nextInt();
//		int price6 = sc.nextInt();
//		int price7 = sc.nextInt();
//		int price8 = sc.nextInt();
//		int price9 = sc.nextInt();
//		int price = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9;
//			
//		total = total - price;
//		
//		System.out.println(total);
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();		// 총 책 가격
		int price = 0;		// 개당 책 가격
		
		for(int i = 1; i <= 9; i++) {		// 입력 값 9개
			price = sc.nextInt();
			total = total - price;		// 총 가격 - 9개 책 가격의 합
		}
		System.out.println(total);
		
		sc.close();
	}

}

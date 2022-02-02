package algorithm;

import java.util.Scanner;

public class Q1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x, y, w, h : ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int min1 = Math.min(x, w - x);
		int min2 = Math.min(y, h - y);
		
		System.out.println(Math.min(min1, min2));
	}
}

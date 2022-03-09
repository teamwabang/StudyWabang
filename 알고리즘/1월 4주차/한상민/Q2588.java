package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2588 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * (b % 10));			// 10으로 나눠준 값의 나머지 값
		System.out.println(a * (b % 100 / 10));		// 100으로 나눠준 값의 나머지를 10으로 나눈 
		System.out.println(a * (b / 100));			// 100으로 나눠준 값
		System.out.println(a * b);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		System.out.println(c * (d % 10));			// 10으로 나눠준 값의 나머지 값
		System.out.println(c * (d % 100 / 10));		// 100으로 나눠준 값의 나머지를 10으로 나눈 
		System.out.println(c * (d / 100));			// 100으로 나눠준 값
		System.out.println(c * d);
	}
}

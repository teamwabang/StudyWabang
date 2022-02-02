package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q2753 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		// 해당 연도를 4로 나눈 값이 0, 그 중 100으로 나눈 값이 0인 것은 제외, 400으로 나눈 값이 0인 것은 윤년으로 포함.
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year2 = Integer.parseInt(br.readLine());
		// 해당 연도를 4로 나눈 값이 0, 그 중 100으로 나눈 값이 0인 것은 제외, 400으로 나눈 값이 0인 것은 윤년으로 포함.
		if((year2 % 4 == 0 && year2 % 100 != 0) || year2 % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}

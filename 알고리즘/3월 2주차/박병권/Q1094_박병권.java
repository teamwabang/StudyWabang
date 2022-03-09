package altudy;

import java.util.Scanner;

public class Q1094_박병권 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt(); //막대길이
		int stick = 64; // 64짜리 스틱
		int cnt = 0; // 붙이는 횟수
		
		while(value>0) {
			if(value<stick) {
				stick/=2; // 막대길이가 stick보다 크면 반띵
			}
			else {
				value -= stick; // ~보다 작으면 붙이기
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}

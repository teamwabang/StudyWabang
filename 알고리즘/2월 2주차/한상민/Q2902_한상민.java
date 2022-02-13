package algorithm;

import java.util.Scanner;

public class Q2902_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String abc = sc.nextLine();
			
		String[] result = abc.split("-");	// Knuth(-)Morris(-)Pratt
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i].charAt(0));	// "-" 를 기준으로 result[i] 값의 0번째값 출력
		}
		sc.close();
		
		
	}

}
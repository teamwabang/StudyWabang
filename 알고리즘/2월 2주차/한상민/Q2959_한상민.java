package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Q2959_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];						// 배열을 생성
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();					// 입력
		}
		Arrays.sort(arr);							// 오름차순 정렬
		System.out.println(arr[0] * arr[2]);		// 첫번째값과 세번째값 곱셈
		
		sc.close();
	}

}

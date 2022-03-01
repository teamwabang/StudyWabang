// Q1076 - 저항

package algorithm;

import java.util.Scanner;

public class Q1076_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		long result1 = 0, result2 = 0, result3 = 0; 
		for(int i = 0; i < color.length; i++) {
			if(a.equals(color[i])) result1 = i;	// a 입력값이랑 color 배열에 저장되어 있는 값이랑 비교해서
			if(b.equals(color[i])) result2 = i;	// result1, 2, 3 값에 저장한다.
			if(c.equals(color[i])) result3 = i;
		}
		
		// brown 값은 1, 10 * 1 = 10 + 1 = 11
		// brown 곱은 10, Math.pow 거듭제곱, 10의 result3 제곱
		long result = (long)((10 * result1 + result2) * Math.pow(10, result3));
		System.out.println(result);	// 세 입력값이 brown이라고 가정하면 (10 * 1 + 1) = 11 * 10 = 110
		
		sc.close();
	}

}

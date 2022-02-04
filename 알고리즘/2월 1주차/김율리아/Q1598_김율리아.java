package backjoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
//원숭이
public class Q1598_김율리아 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//두 숫자간의 차이는 몫의 차이 + 큰나머지에서 작은 나머지 빼준 값
		int a, b; 
		a = sc.nextInt()-1;
		b = sc.nextInt()-1;
		int x1 = a/4, y1 = a%4, x2 = b/4,  y2 = b%4;
		System.out.println(Math.abs(x1-x2)+Math.abs(y1-y2));
	}
}


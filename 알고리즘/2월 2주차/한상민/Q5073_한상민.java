package algorithm;

import java.util.Scanner;

public class Q5073_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0) break;
			
			if(a >= b + c || b >= a + c || c >= a + b) System.out.println("Invalid");		// 삼각형이 만들어지지 않을 경우
			else if(a == b && b == c) System.out.println("Equilateral");		// 세 변의 길이가 모두 같은 경우
			else if(a == b || b == c || a == c) System.out.println("Isosceles");		// 두 변의 길이만 같은 경우
			else if(a != b && b != c && c != a) System.out.println("Scalene");		// 세 변의 길이가 모두 다른 경우
			else System.out.println("Invalid");
		}
		sc.close();
	}

}

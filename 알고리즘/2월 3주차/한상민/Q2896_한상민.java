// Q2896 - 무알콜 칵테일
// 참고 - https://blog.naver.com/wltnals09/222427839280

package algorithm;

import java.util.Scanner;

public class Q2896_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		double i = sc.nextDouble(), j = sc.nextDouble(), k = sc.nextDouble();
		
		double min = 0;
		double min1 = a / i;
		double min2 = b / j;
		double min3 = c / k;

		if(min1 <= min2) {
			if(min1 <= min3) {
				min = min1;
			} else {
				min = min3;
			}
		} else {
			if(min2 <= min3) {
				min = min2;
			} else {
				min = min3;
			}
		}
		
//		min = min1 < min2 ? min1 : min2;
//		min = min < min3 ? min : min3;
		
		double resultA = a - (i * min);
		double resultB = b - (j * min);
		double resultC = c - (k * min);

		System.out.println(resultA + " " + resultB + " " + resultC);
		
		sc.close();
	}
}

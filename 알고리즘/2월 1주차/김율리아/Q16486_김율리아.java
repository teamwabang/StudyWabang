package backjoon;

import java.util.Scanner;
//운동장 둘레
public class Q16486_김율리아 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int d1 = sc.nextInt();
		int d2 = sc.nextInt()*2;
		double pie = 3.141592;
		double perimeter = d1*2 + (d2*pie);
		
		System.out.println(perimeter);
	}
}

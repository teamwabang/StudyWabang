package algorithmstudyBOJ;

import java.util.Scanner;

public class Q16486_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		
		double rect = 2*d1;
		double cir = 2*3.141592*d2;
		
		System.out.println(rect+cir);

	}

}

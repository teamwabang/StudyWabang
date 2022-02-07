package algorithmstudyBOJ;

import java.util.Scanner;

public class Q2965_정재홍
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		if(third-second > second-first) {
			System.out.println(third - second - 1);
		} else {
			System.out.println(second - first - 1);
		}
		
		

	}

}

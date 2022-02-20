// Q14710 - 한상민

package algorithm;

import java.util.Scanner;

public class Q14710_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		
		int result = a * 12;
		
		if(result % 360 == b) System.out.println("O");
		else System.out.println("X");
		
		sc.close();
	}

}

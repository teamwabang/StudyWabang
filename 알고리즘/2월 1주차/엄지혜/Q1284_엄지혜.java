package test;

import java.util.Scanner;

public class B1284 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			String num = in.nextLine();
			if (num.equals("0"))
				break;
			
			int result = 2;
			result += num.length() - 1;
			
			for (int i = 0; i < num.length(); i++) {
				if (num.charAt(i) == '1') {
					result += 2;
				} 
				else if (num.charAt(i) == '0') {
					result += 4;
				} 
				else {
					result += 3;
				}
			}
			System.out.println(result);
		}
	}
}

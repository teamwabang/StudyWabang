package algorithmstudyBOJ;

import java.util.Scanner;

public class Q2902_정재홍
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = '?';
		
		for(int i=0;i<str.length();i++) {
			int s = str.charAt(i);
			if(s >=65 && s<=90) {
				ch = (char)s;
				System.out.print(ch);
			}
		
		}	
				
	}

}

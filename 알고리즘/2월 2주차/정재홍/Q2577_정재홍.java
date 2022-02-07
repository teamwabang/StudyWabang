package algorithmstudyBOJ;

import java.util.Scanner;


public class Q2577_정재홍{
	
	static int cnt(String str, char ch) {
		int count = 0;
		
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= sc.nextInt();
		
		int sum = a*b*c;
		
		String s = Integer.toString(sum);	
		System.out.println(cnt(s,'0'));
		System.out.println(cnt(s,'1'));
		System.out.println(cnt(s,'2'));
		System.out.println(cnt(s,'3'));
		System.out.println(cnt(s,'4'));
		System.out.println(cnt(s,'5'));
		System.out.println(cnt(s,'6'));
		System.out.println(cnt(s,'7'));
		System.out.println(cnt(s,'8'));
		System.out.println(cnt(s,'9'));
		
	}

}

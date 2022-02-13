package altudy;

import java.util.Scanner;

public class Q2386_박병권 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		String inputString = sc.nextLine().toLowerCase();
		if(inputString.equals("#")) break;
		char inputChar = inputString.charAt(0);
		
		int cnt = 0;
		for(int i = 1; i < inputString.length(); i++) {
			if(inputString.charAt(0)==inputString.charAt(i) ) cnt++;
			if(i == inputString.length()-1) {
			System.out.println(inputString.charAt(0) + " " + cnt);
			}//if
		}//for
	}//while
		sc.close();
}//main

}
//g Programming Contest
//n New Zealand
//x This is quite a simple problem.
//#
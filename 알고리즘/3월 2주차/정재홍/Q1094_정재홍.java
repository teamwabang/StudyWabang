package algorithmstudyBOJ;

import java.util.Scanner;

public class Q1094_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int st = 64;
		int cnt = 0;
		while(true) {
			if(st>x) {
				st=st/2;
			} else {
				x-=st;
				cnt++;
			}
			
			if(x==0) {
				break;
			}
		}
		System.out.println(cnt);
	

	}

}

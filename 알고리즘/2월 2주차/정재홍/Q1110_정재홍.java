package algorithmstudyBOJ;

import java.util.Scanner;

public class Q1110_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int tmp = n;
		
		while(true) {
			int ten = n/10;
			int one = n%10;
			n = one*10 + (ten + one)%10;
			cnt++;
			if(tmp == n) {
				break;
			}
		}
		System.out.println(cnt);

	}

}

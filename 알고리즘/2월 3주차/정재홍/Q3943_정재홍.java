package algorithmstudyBOJ;

import java.util.Scanner;

public class Q3943_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int max = n;
			while(true) {
				if(n==1) {
					break;
				}
				if(n%2==0) {
					if(n>=max) {
						max=n;
					}
					n = n/2;				
				} else if (n%2==1) {
					if(n>=max) {
						max=n;
					}
					n = n*3+1;
					
				}
			}
			System.out.println(max);
		}
	}

}

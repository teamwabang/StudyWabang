package standard;

import java.util.Scanner;

public class Q2839_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		int n2 = 0;
		
		while(true) {
			if (n%5==0) {
				result += n/5;
				System.out.println(result);
				break;
			} else {
				n -= 3;
				result++;
			}
			
			if(n<0) {
				System.out.println("-1");
				break;
			}
		
		}

	}

}
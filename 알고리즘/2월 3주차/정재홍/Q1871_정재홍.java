package algorithmstudyBOJ;

import java.util.Scanner;

public class Q1871_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] str = new int[3];
		int [] num = new int[4];
		int strSum = 0;
		int numSum = 0;
		
		for(int i=0;i<n;i++) {
			String s = sc.next();
			for(int j = 0;j<str.length;j++) {
				str[j]=s.charAt(j)-65;
			}
			strSum = str[0]*26*26 + str[1]*26 + str[2];
			
			for(int k=0;k<num.length;k++) {
				num[k]=s.charAt(k+4)-48;
			}
			numSum = num[0]*1000+num[1]*100+num[2]*10+num[3];
			
			if(Math.abs(strSum - numSum) <= 100) {
				System.out.println("nice");
			} else {System.out.println("not nice");}
		}		
	}
}

package algorithmstudyBOJ;

import java.util.Scanner;

public class Q2857_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		int cnt = 0;
		for(int i=0;i<5;i++) {
			String s = sc.next();
			arr[i] = s;
			if(arr[i].indexOf("FBI") > -1) {
				System.out.print(i+1 + " ");
				cnt++;
			}		
		}
		if(cnt == 0) {
			System.out.println("HE GOT AWAY!");
		}
	}
}



package standard;

import java.util.Scanner;

public class Q2386_정재홍{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int cnt = 0;
			String alphabet = sc.next();
			String str = sc.next();
			String str2 = str.toLowerCase();
			if(alphabet.equals("#"))
				break;
			
			char [] arr = str2.toCharArray();
			for(int i=0;i<arr.length;i++) {
				if(alphabet.equals(arr[i]))
					cnt++;
				System.out.print(arr[i]);
			}
		}

	}

}

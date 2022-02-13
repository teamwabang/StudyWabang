package backjoon;

import java.util.Scanner;

public class Q1284 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>0) {
		 for (int i = 1; i<=arr.length; i++){
		 	 space++; }
		 	System.out.println("좌우,중간 공백 " + space);
		 for (int j = 0; j <= arr.length-1; j++) {
			 if(arr[j]==1)
				 space1 = 2;
			 else if (arr[j]==0)
				 space0 = 4;
			 else if (arr[j]>=2)
				 space3 = 3;
			 arr[j]++;
		 } System.out.println("1 :" + space1 + " 0 : " + space0 + " 3: " + space3);


		}else 
		 return;
	
	}

}

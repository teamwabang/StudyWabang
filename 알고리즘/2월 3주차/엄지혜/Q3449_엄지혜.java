package test;

import java.util.Scanner;

public class B3449 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
	
	for (int i = 0; i < N; i++) {
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();
		
		int cnt = 0;
		for (int j = 0; j < B.length; j++) {
			if(A[j] != B[j]) 
			
			cnt++;
		}
		System.out.println("Hamming distance is "+cnt+".");
	}
}

}

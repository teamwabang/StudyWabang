package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Q1427_한상민 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		char[] arr = n.toCharArray();
		Arrays.sort(arr);
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		sc.close();
	}

}

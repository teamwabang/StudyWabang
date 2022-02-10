package test;

import java.util.Arrays;
import java.util.Scanner;

public class B5565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		    int sum = sc.nextInt();
			int [] arr = new int[9];
	        
	        for(int i=0; i < 9; i++) {
	            arr[i]=sc.nextInt();
	        }
	        int sum2 = Arrays.stream(arr).sum();
	        
	        System.out.println(sum - sum2);
	}

}

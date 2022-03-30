package test;

import java.util.Arrays;
import java.util.Scanner;

public class B1302 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cnt = 0;
		int max = 0;
		String result = "";
		
		String[] arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i].equals(arr[0])) {
				cnt ++;
			}
			else {
				if(cnt > max) {	
					max = cnt;
					result = arr[0];
				}
				
				arr[0] = arr[i];
				cnt = 1;
			}
		}
		
		if(cnt > max)
			result = arr[0];
		
		System.out.println(result);
	}

}
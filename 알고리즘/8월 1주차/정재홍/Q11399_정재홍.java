package algorithmstudyBOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Q11399_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int wait = 0;
		int result = 0;
		
		for(int i=0;i<N;i++) {
			wait += arr[i];
			result += wait;
		}
		System.out.println(result);
	
	}

}
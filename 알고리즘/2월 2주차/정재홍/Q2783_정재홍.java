package algorithmstudyBOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Q2783_정재홍 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		double result = 1000*(double)x/y;

		int n = sc.nextInt();
		double [] arr = new double[n+1];
		arr[0] = result;
		
		for(int i=0;i<n;i++) {
			int xi = sc.nextInt();
			int yi = sc.nextInt();
			double resulti = 1000*(double)xi/yi;
			
			arr[i+1] = resulti;
		}
		
		Arrays.sort(arr);
		System.out.printf("%.2f",arr[0]);

	}

}

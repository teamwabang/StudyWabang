package test;

import java.util.Arrays;
import java.util.Scanner;

public class B2783 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int N = sc.nextInt();
		
		double a[] = new double[N+1];
		a[0]=(double)X/Y;
		
		for(int i = 0; i < N; i++) {
	          int x=sc.nextInt();
	          int y=sc.nextInt();
	          a[i+1] = (double)x/y;
		}
		Arrays.sort(a);
		double Min = a[0]*1000;
		
		System.out.println(Min);
	}
}

package standard;

import java.util.Arrays;
import java.util.Scanner;

public class Q2167_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
			
		int [][] arr = new int[n+1][m+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int k = sc.nextInt();	
		for(int l=0;l<k;l++) {
			int sum = 0;
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int a=i;a<=x;a++) {
				for(int b=j;b<=y;b++) {
					sum += arr[a][b];
				}			
			}
			System.out.println(sum);		
		}	
	}
}

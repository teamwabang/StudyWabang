package algorithmstudyBOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Q2693_정재홍{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[10];
		int [] result = new int[n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			result[i]=arr[7];
		}
		for(int a : result) {
			System.out.println(a);
		}
	}

}

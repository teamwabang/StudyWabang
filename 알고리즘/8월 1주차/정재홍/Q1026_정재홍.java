package algorithmstudyBOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Q1026_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] a = new int[N];
		int [] b = new int[N];
		
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			b[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int result = 0;
		for(int i=0;i<N;i++) {
			result += a[i]*b[N-i-1];
		}
		
		System.out.println(result);

	}

}
package algorithmstudyBOJ;

import java.util.Scanner;

public class Q9095_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[11];
		
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int i=4;i<arr.length;i++) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
		}
		
		for(int i=0;i<n;i++) {
			int j = sc.nextInt();
			System.out.println(arr[j]);
		}
		/* DP
		 * 1. problem이 더 작은 sub problem으로 쪼개질 때
		 * 2. sub problem으로 큰 problem을 구할 수 있을 때
		 * 3. sub problem들이 겹칠 때*/
	}

}

package altudy;

import java.util.Scanner;

public class Q2775_박병권 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[][] APT = new int[15][15]; // 2차원배열로 아파트 층,호 생성
 
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;	// i층 1호
			APT[0][i] = i;	// 0층 i호
		} 
		for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지 
			for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
		
		// 테스트 부분 		
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
			int k = in.nextInt();
			int n = in.nextInt();
			System.out.println(APT[k][n]);
		}
	}

}
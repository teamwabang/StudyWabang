// Q2167 - 2차원 배열의 합
// 참고 - https://m.blog.naver.com/zzang9ha/221636654347

package algorithm;

import java.util.Scanner;

public class Q2167_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열의 크기를 입력한다.
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // 2차원 배열 생성
        int[][] arr = new int[n + 1][m + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = sc.nextInt();	// 각 2차원 배열의 행, 열에 값 입력받는다.
            }
        }
        
        // 2차원 배열의 합을 구할 갯수를 입력한다.
        int arrSum = sc.nextInt();
        for (int k = 0; k < arrSum; k++) {
            int sum = 0;
            // i, j - x, y 까지의 합을 구할 변수들을 입력한다.
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int i2 = i; i2 <= x; i2++) {
                for (int j2 = j; j2 <= y; j2++) {
                    sum += arr[i2][j2];
                }
            }
            System.out.println(sum);
		}
        sc.close();
	}

}

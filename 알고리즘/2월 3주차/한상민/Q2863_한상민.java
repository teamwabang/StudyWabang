// Q2863 - 이게 분수?

package algorithm;

import java.util.Scanner;

public class Q2863_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		// a b  c a  d c  b d
		// c d  d b  b a  a c
		// 4번 회전하면 다시 원래대로 돌아온다.
		double[] result = { (a / c) + (b / d), (c / d) + (a / b), (d / b) + (c / a), (b / a) + (d / c) };
		
		double max = 0;	// 처음 상태가 최대값이면 회전 횟수가 0 이기 때문에 초기값을 설정해준다.
		int cnt = 0;	// 회전 횟수
		
		for(int i = 0; i < 4; i++) {	// 배열에서 최댓값 찾기 공식
			if(max < result[i]) {	// result[i] 값이 max보다 크면
				max = result[i];	// max에 저장하며,
				cnt = i;	// i값을 cnt로 바꿔준다.
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}

}
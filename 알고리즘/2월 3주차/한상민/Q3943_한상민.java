// Q3943 - 헤일스톤 수열

package algorithm;

import java.util.Scanner;

public class Q3943_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();	// 테스트 케이스의 개수
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();	// 헤일스톤 수열의 시작값 
			
			// 정수 result를 생성하여 n 값을 일단 저장해준다.
			// result를 처음에 1로 저장했더니, '100000' 입력값이 '50000'으로 나왔다.
			int result = n;
			while(n != 1) {	// n이 1이 아니라면
				if(n % 2 == 0) {	// n이 짝수라면, n을 2로 나눈 값의 몫이 0이 될때까지
					n /= 2;	// 2로 나눠준다.
					if(n > result) result = n;	// result 값과 n 값을 비교하여 n이 크다면 result에 저장한다.
				} else {	// n이 홀수라면,
					n = (n * 3) + 1;	// n에 3을 곱한뒤 1을 더한다.
					if(n > result) result = n;	// result 값과 n 값을 비교하여 n이 크다면 result에 저장한다.
				}
			}			
			System.out.println(result);	// result 출력
		}
		sc.close();
	}

}

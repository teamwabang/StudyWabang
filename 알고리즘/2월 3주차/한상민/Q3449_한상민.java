// Q3449 - 해밍 거리
// 참고 - https://wonsang98.tistory.com/97

package algorithm;

import java.util.Scanner;

public class Q3449_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();	// 테스트 케이스의 개수
		
		for(int i = 0; i < t; i++) {
			int cnt = 0;	// 해밍 거리
			
			String a = sc.next(), b = sc.next();	// string 값으로 입력
			
			String[] result1 = a.split("");	// 각 단어 하나씩 잘라 result1에 저장한다.
			String[] result2 = b.split("");	// 각 단어 하나씩 잘라 result2에 저장한다.
			for(int j = 0; j < result1.length; j++) {
				if(! result1[j].equals(result2[j])) cnt++;	// result1 값과 result2 값이 다르면 cnt 값을 하나씩 증가한다.
			}
			System.out.println("Hamming distance is " + cnt + ".");
		}
		sc.close();
	}
}

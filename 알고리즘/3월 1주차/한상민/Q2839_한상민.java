// Q2839 - 설탕 배달

package algorithm;

import java.util.Scanner;

public class Q2839_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		while(true) {
			if(n % 5 == 0) {	// 5의 배수라면
				cnt += n / 5;	// 5로 나눠 cnt에 몫을 더해준다.
				break;	// 5로 나누다가 나머지가 0이 된다면 반복문을 빠져나온다.
			}
			n -= 3;	// 5의 배수가 아니라면 / 5로 나눌 값이 더이상 없다면 3을 빼주고
			cnt++;	// cnt를 증가시킨다.
			if(n <= 0) break;	// n이 0보다 작거나 같으면 반복문을 빠져나온다.
		}
		
		if(n < 0) System.out.println("-1");	// 만약 n이 0보다 작으면 -1을 출력하고
		else System.out.println(cnt);	// 그렇지 않다면, cnt 값을 출력해준다.
		
		sc.close();
	}

}

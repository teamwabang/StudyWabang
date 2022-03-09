// Q1094 - 막대기

package algorithm;

import java.util.Scanner;

public class Q1094_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	// 원하는 막대기 길이(=입력값)
		int stick = 64;	// 가지고 있는 막대기 길이
		int cnt = 0;
		
		while(true) {
			if(stick > x) {	// 가지고 있는 막대기 길이가 입력값 보다 크면
				stick /= 2;	// 가지고 있는 막대기 길이를 반으로 나눈다.
			} else {	// 입력값 보다 작다면
			 	 cnt++;	// cnt 값을 1 증가시키고
			 	 x -= stick;	// 입력값에서 가지고 있는 막대기 길이를 빼준다.
			}
			
			if(stick == 0) break;	// 막대기 길이가 0이 될때까지 반복하다 while문을 종료한다.
		}
		System.out.println(cnt);
		
		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		
//		int x = sc.nextInt();	// 원하는 막대기 길이
//		int stick = 64;
//		int cnt = 0;	// 횟수
//		int length = stick;
//		
//		while(x != 0) {
//			if(x == stick) {
//				cnt++;
//				break;
//			}
//			length /= 2;
//			if(x < length) {
//				continue;
//			} else {
//				cnt++;
//				x -= length;
//			}
//		}
//		System.out.println(cnt);
//		
//		sc.close();
	}

}

package algorithm;

import java.util.Scanner;

public class Q2857_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] fbi = new String[5];	// 5명의 요원 배열로 입력
//		fbi[0] = sc.next();
//		fbi[1] = sc.next();
//		fbi[2] = sc.next();
//		fbi[3] = sc.next();
//		fbi[4] = sc.next();
		for(int i = 1; i <= 5; i++) {
			fbi[i] = sc.next();
		}
		
		int cnt = 0;
		for(int i = 0; i < fbi.length; i++) {
			// indexOf를 사용하려 했지만 오류가 나서 검색을 하여 contains 메소드를 찾았다.
			// indexOf - 대상 문자열에서 찾고자 하는 문자의 index값을 찾고싶을때 사용
			// contains - 대상 문자열에서 찾고자 하는 문자열이 포함되어 있는지 여부를 알고 싶을때 사용
			if(fbi[i].contains("FBI")) {
				System.out.println(i + 1);	// i + 1이 아니라 i값만 주면 0만 출력된다.
				cnt++;
			}
		}
		if(cnt == 0) {	// cnt 값이 0이라면 FBI가 문자열에 없다는것으로 해당되니까
			System.out.println("HE GOT AWAY!");	// 해당 내용이 출력된다.
		}
		sc.close();
	}

}

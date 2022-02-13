package algorithm;

import java.util.Scanner;

public class Q2386_한상민 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int cnt = 0;
			String abc = sc.nextLine();
			
			if (abc.equals("#")) break;		// # 중단
			
			String result = abc.toLowerCase();		// 입력 값을 소문자로 변경
			for (int i = 1; i < abc.length(); i++) {
				if (result.charAt(0) == result.charAt(i)) cnt++;		// result의 0번 값과 result의 i값이랑 같으면 +
				if (i == result.length() - 1) System.out.println(result.charAt(0) + " " + cnt);		// i가 result의 길이 -1 값과 같으면 해당내용 출력
			}
			
		}
		sc.close();
	}

}

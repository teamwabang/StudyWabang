package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class Q1009 {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
		//StringTokenizer st;
		//StringBuilder sb = new StringBuilder();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int t = sc.nextInt();		// 테스트 케이스 개수
		
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			// 제곱 수가 10이 넘을 때마다, 10으로 나눈 나머지로 바꾸기
			int c = 1;
			for(int j = 0; j < b; j++) {
				c = ((c * a) % 10);
			}
			
			if(c == 0) c = 10;
			System.out.println("개수 : " + c);
			
			//sb.append(c);
		}
		sc.close();
		
	}

}

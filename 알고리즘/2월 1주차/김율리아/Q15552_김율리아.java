package backjoon;

import java.io.*;                  //java.io.*로 통합시킴
import java.util.StringTokenizer;

public class Q15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));    //reader 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(bf.readLine());
		StringTokenizer st; //StringTokenizer에 문자열 입력  - 공란 포함 String Line일 경우 사용 
		// 구분자를 기준으로 나뉘어진 문자열을 token이라고 함  - 구분자 생략시 공백이나 탭이 기본 구분자로 사용됨 
		
		for (int i=1; i<=t;i++) {
			st = new StringTokenizer(bf.readLine()); // 출력할 문자열

			int a = Integer.parseInt(st.nextToken()); //각 token을 출력 → String Line 이므로  int값으로 형변환
			int b = Integer.parseInt(st.nextToken());
			int c = a+b;
			bw.write(c+"\n"); //출력. 개행 추가 	
		}
		bw.flush(); //남아있는 데이터 모두 출력(버퍼 비우기)          /입력안해주면 출력x 
//		bw.close(); //스트림 닫음 
	}
}

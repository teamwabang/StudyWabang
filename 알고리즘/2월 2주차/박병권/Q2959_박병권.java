package altudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2959_박병권 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int arr[] = new int[3]; // 배열생성
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); // 입력받은 nextToken을 int로 배열에 저장
		}
		Arrays.sort(arr); // 오름차순 정렬
		System.out.println(arr[0] * arr[2]); // 첫번째 x 세번째
		
	}

}

package algorithmstudyBOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1598_정재홍 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int width = Math.abs(((a-1)/4 - (b-1)/4));  
		int height = Math.abs(((a-1)%4 - (b-1)%4)); 
		// 0이 없어서 좌표 구할 때 -1를 해줘야하는 걸까요?
		
		System.out.println(width + height);
	}

}

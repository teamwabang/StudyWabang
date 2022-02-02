package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884_한상민 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(m >= 45) {				// m이 45보다 크면 m - 45분
			m = m - 45;
		} else {					// 45보다 작다면
			h -= 1;					// h - 1시간
			m = (m + 60) - 45;		// 현재 (m + 1시간) - 45분
		}
		
		if(h < 0) h += 24;			// h가 0보다 작을 경우 + 24시간
		
		System.out.printf("%d %d\n", h, m);
	}

}

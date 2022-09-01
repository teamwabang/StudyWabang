import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 9372 상근이의 여행
 * @author tkdalsgks
 * 
 * 복잡하게 생각하지 말고 'n - 1' 만 출력하면 된다고....
 */

public class Q9372_한상민 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());	// 테스트 케이스
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());	// 국가
			int b = Integer.parseInt(st.nextToken());	// 비행기
			
			for(int j = 0; j < b; j++) {
				st = new StringTokenizer(br.readLine());
			}
			System.out.println(a - 1);
		}
		
	}

}

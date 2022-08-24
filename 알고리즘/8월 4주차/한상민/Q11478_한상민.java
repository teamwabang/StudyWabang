import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
 * 
 * 백준 11478 서로 다른 부분 문자열의 개수
 * 
 * Set은 순서를 보장하지는 않지만 중복되는 데이터를 무시하는 성질이 있음.
 * a, b, a, b, c, ab, ba ... ababc 까지 찾을 수 있으며 중복되지 않는 것의 개수는 12개 이다.
 * 
 * 이를 활용하여 for문을 2중으로 구현하여 substring 함수로 나눈다.
 * 
 */

public class Q11478_한상민 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<String>();
		
		String S = br.readLine();
		
		for(int i = 0; i <= S.length(); i++) {
			for(int j = 0; j < i; j++) {
				set.add(S.substring(j, i));
			}
		}
		
		System.out.println(set.size());
	}

}

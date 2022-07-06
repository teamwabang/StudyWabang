import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11722_이민아 {

	public static void main(String[] args) throws Exception {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] number = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 입력값 저장
		for(int i=0;i<N;i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		// length[index] = number[index]로 시작하는 가장 긴 감소하는 수열의 길이
		int[] length = new int[N];
		
		// number[i]로 시작하는 가장 긴 감소하는 수열의 길이 저장 (뒤에서부터)
		for(int i=N-1;i>=0;i--) {
			int max = 1;
			for(int j=N-1;j>i;j--) {
				// number[j]로 시작하는 가장 긴 감소하는 수열 앞에 number[i]가 위치할 수 있는지 확인
				if(number[j]<number[i] && max<length[j]+1) {
					max = length[j]+1;
				}
			}
			length[i] = max;
		}
		
		// 배열 length[] 중에서 가장 긴 값 찾기
		int answer = 1;
		for(int i=0;i<N;i++) {
			if(answer<length[i]) {
				answer = length[i];
			}
		}
		
		System.out.println(answer);

	}

}

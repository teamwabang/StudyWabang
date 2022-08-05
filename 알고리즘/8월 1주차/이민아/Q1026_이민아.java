import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1026_이민아 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int answer=0;
		
		int[] A = new int[N];
		int[] B = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i=0;i<N;i++) {
			answer += A[i]*B[N-i-1];
		}
		
		System.out.println(answer);
	}
}

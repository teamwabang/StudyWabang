package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773_한상민 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int k = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < k; i++) {
			int a = Integer.parseInt(br.readLine());
			
			if(a == 0)
				stack.pop();	// 0이면 꺼냄
			else
				stack.push(a);	// 아니라면 push
		}
		
		int sum = 0;
		for(int a : stack) sum += a;	// 스택에 저장된 모든 수의 합 계산
		
		System.out.println(sum);
		
		br.close();

	}
	
}

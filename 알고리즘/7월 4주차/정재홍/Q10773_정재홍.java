package algorithmstudyBOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773_정재홍 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int result = 0;
		
		for(int i=0;i<k;i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				stack.pop();
			} else {
				stack.push(n);
			}
			
		}
		
		for(int m : stack) {
			result += m;
		}
		
		System.out.println(result);
		

	}

}

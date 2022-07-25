import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773_이민아 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int answer = 0;
		
		for(int i=0;i<K;i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				stack.pop();
			}else {
				stack.add(num);
			}
		}
		
		while(!stack.isEmpty()) {
			answer += stack.pop();
		}
		
		System.out.println(answer);

	}

}

package algorithmstudyBOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10828_정재홍 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack stack = new Stack()
;		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			switch(str) {
			case "push" :
				int number = Integer.parseInt(st.nextToken());
				stack.push(number);
				break;
			case "pop" :
				if(stack.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.pop());
				} break;
			case "size" :
				System.out.println(stack.size());
				break;
			case "empty" :
				if(stack.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				} break;
			case "top" :
				if(stack.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
				} break;
			} 
			
		}

	}

}

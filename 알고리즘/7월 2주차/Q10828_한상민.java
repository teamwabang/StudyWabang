package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10828_한상민 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
				case("push") :
					stack.push(Integer.parseInt(st.nextToken()));	// 정수를 스택에 넣기
					break;
				case("pop") :
					if(stack.isEmpty()) {	// 스택이 비어있으면 -1 출력
						bw.write("-1\n");
						break;
					} else {	// 비어있지 않으면 가장 위에 있는 정수를 빼고, 그 수를 출력
						bw.write(stack.pop() + "\n");
						break;
					}
				case("size") :
					bw.write(stack.size() + "\n");	// 스택에 들어 있는 정수의 개수
					break;
				case("empty") :
					if(stack.isEmpty()) {	// 스택이 비어있으면 1 출력
						bw.write("1\n");
						break;
					} else {	// 스택이 비어있지 않으면 0 출력
						bw.write("0\n");
						break;
					}
				case("top") :
					if(stack.isEmpty()) {	// 스택에 들어있는 정수가 없으면 -1 출력
						bw.write("-1\n");
						break;
					} else {
						bw.write(stack.peek() + "\n");	// 스택이 비어있지 않으면 가장 위에 있는 정수 출력
					}
			}
		}
		bw.flush();
		br.close();
	}

}

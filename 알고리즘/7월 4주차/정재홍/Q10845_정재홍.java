package algorithmstudyBOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845_정재홍 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue queue = new LinkedList();
		int number = 0;
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
		switch (str) {
		case "push" :
			number = Integer.parseInt(st.nextToken());
			queue.add(number);
			break;
		case "pop" :
			if(queue.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(queue.poll());
			}
			break;
		case "size" :
			System.out.println(queue.size());
			break;
		case "empty" :
			if(queue.isEmpty()) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
			break;
		case "front" :
			if(queue.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(queue.peek());
			}
			break;
		case "back" :
			if(queue.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(number);
			}
			break;
		}
		}
	}

}

package algorithmstudyBOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q10866_정재홍 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque deque = new ArrayDeque ();
		
		
		
;		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
		switch(str) {
		
		case "push_front" :
			deque.addFirst(Integer.parseInt(st.nextToken()));
			break;
		case "push_back":	
			deque.addLast(Integer.parseInt(st.nextToken()));
			break;
		case "pop_front" :
			if(deque.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(deque.removeFirst());
			}
			break;
		case "pop_back" :
			if(deque.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(deque.removeLast());
			}
			break;
		case "size" :
			System.out.println(deque.size());
			break;
		case "empty" :
			if(deque.isEmpty()) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
			break;
		case "front" :
			if(deque.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(deque.peekFirst());
			}
			break;
		case "back" :
			if(deque.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(deque.peekLast());
			}
			break;
			
		}		
		}
	}
}
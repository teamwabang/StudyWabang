package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845_한상민 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case("push") :
				a = Integer.parseInt(st.nextToken());
				queue.add(a);
				break;
			case("pop") :
				if(queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.poll() + "\n");
				break;
			case("size") :
				bw.write(queue.size() + "\n");
				break;
			case("empty") :
				if(queue.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
				break;
			case("front") :
				if(queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.peek() + "\n");
				break;
			case("back") :
				if(queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(a + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();

	}

}

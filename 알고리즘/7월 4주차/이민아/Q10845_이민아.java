import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845_이민아 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N;
		N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		int num = -1;
		
		StringTokenizer st;
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
          
			case "push" :
				num = Integer.parseInt(st.nextToken());
				queue.add(num);
				break;
			case "pop" :
				if(queue.isEmpty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(queue.poll() + "\n");
				}
				break;
			case "size" :
				bw.write(queue.size() + "\n");
				break;
			case "empty" :
				if(queue.isEmpty()) {
					bw.write(1 + "\n");
				}else {
					bw.write(0 + "\n");
				}
				break;
			case "front" :
				if(queue.isEmpty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(queue.peek() + "\n");
				}
				break;
			case "back" :
				if(queue.isEmpty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(num + "\n");
				}
				break;
          
			}
			
		}
		
		bw.flush();
		bw.close();
		
	}

}

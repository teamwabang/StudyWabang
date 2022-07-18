import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10866_이민아 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> deque = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			if(command.equals("push_front")) {
				int num = Integer.parseInt(st.nextToken());
				deque.add(0, num);
			}else if(command.equals("push_back")) {
				int num = Integer.parseInt(st.nextToken());
				deque.add(num);
			}else if(command.equals("pop_front")) {
				if(deque.size()==0) {
					bw.write(-1 + "\n");
				}else {
					int num = deque.remove(0);
					bw.write(num + "\n");
				}
			}else if(command.equals("pop_back")) {
				if(deque.size()==0) {
					bw.write(-1 + "\n");
				}else {
					int num = deque.remove(deque.size()-1);
					bw.write(num + "\n");
				}
			}else if(command.equals("size")) {
				bw.write(deque.size() + "\n");
			}else if(command.equals("empty")) {
				if(deque.size()==0) {
					bw.write(1 + "\n");
				}else {
					bw.write(0 + "\n");
				}
			}else if(command.equals("front")) {
				if(deque.size()==0) {
					bw.write(-1 + "\n");
				}else {
					int num = deque.get(0);
					bw.write(num + "\n");
				}
			}else if(command.equals("back")) {
				if(deque.size()==0) {
					bw.write(-1 + "\n");
				}else {
					int num = deque.get(deque.size()-1);
					bw.write(num + "\n");
				}
			}
			
		}
		bw.flush();
		bw.close();
		

	}

}

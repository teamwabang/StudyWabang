import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10828_이민아 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> stack = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			if(command.equals("push")) { // push 명령어
        
				int num = Integer.parseInt(st.nextToken());
				stack.add(num);
        
			}else if(command.equals("pop")) { // pop 명령어
        
				if(stack.size()==0) {   // stack이 비어있다면
					bw.write(-1 + "\n");
				}else {                 // stack에 데이터가 있다면
					bw.write(stack.remove(stack.size()-1) + "\n");
				}
        
			}else if(command.equals("size")) {     // size 명령어
        
				bw.write(stack.size() + "\n");
        
			}else if(command.equals("empty")) {    // empty 명령어
        
				if(stack.size()==0) {
					bw.write(1 + "\n");
				}else {
					bw.write(0 + "\n");
				}
        
			}else if(command.equals("top")) {   // top 명령어
        
				if(stack.size()==0) {   // stack이 비어있다면
					bw.write(-1 + "\n");
				}else {                 // stack에 데이터가 있다면
					bw.write(stack.get(stack.size()-1) + "\n");
				}
        
			}
			
		}
		bw.flush();
		bw.close();
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11866_이민아 {

	public static void main(String[] args) throws Exception{
		int N;
		int K;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> yose = new ArrayList<Integer>();
		
		for(int i=1;i<=N;i++) {
			yose.add(i);
		}
    
		int index=0;
		bw.write("<");
    
		while(yose.size()!=0) {
			index = index+K-1;
			index = index%yose.size();
			int num = yose.remove(index);
      
			if(yose.size()==0) {
				bw.write(num + ">");
			}else {
				bw.write(num +", ");
			}
      
		}
    
		bw.flush();
		bw.close();
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2606_이민아 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int computer = Integer.parseInt(br.readLine());
		int link = Integer.parseInt(br.readLine());
		
		ArrayList<List<Integer>> network = new ArrayList<>();
		
		for(int i=0;i<computer;i++) {
			ArrayList<Integer> tmp = new ArrayList<>();
			network.add(tmp);
		}
		
		for(int i=0;i<link;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken())-1;
			int num2 = Integer.parseInt(st.nextToken())-1;
			
			network.get(num1).add(num2);
			network.get(num2).add(num1);
		}
		
		boolean[] check = new boolean[computer];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		int answer = 0;
		check[0] = true;
		
		while(!queue.isEmpty()) {
			int tmp = queue.poll();
			List<Integer> tmplist = network.get(tmp);
			int length = tmplist.size();
			for(int i=0;i<length;i++) {
				if(check[tmplist.get(i)]==false) {
					check[tmplist.get(i)] = true;
					queue.add(tmplist.get(i));
					answer++;
				}
			}
			
		}
		
		System.out.println(answer);
		
		
	}

}

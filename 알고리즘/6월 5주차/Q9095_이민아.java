import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q9095_이민아 {

	public static void main(String[] args) throws Exception{
		int T;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> array = new ArrayList<>();
		
		// 1,2,3일때 값 초기화
		array.add(1);
		array.add(2);
		array.add(4);
		
		for(int i=0;i<T;i++) {
			int n = Integer.parseInt(br.readLine());
			
			// array[n] = array[n-1] + array[n-2] + array[n-3]
			for(int j=array.size();j<n;j++) {
				int a = array.get(j-1);
				int b = array.get(j-2);
				int c= array.get(j-3);
				array.add(a+b+c);
			}
			
			System.out.println(array.get(n-1));
			
		}
		

	}

}

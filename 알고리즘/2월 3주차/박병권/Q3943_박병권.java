package altudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3943_박병권2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(sc.readLine());
		for(int i=0; i<n; i++) {
			int t = Integer.parseInt(sc.readLine());
			int max = t;
			while(t!=1) {
				t = (t%2 == 0) ? t/2 : (t*3)+1;
				max = Math.max(max, t);
			}
			System.out.println(max);
		}
		sc.close();
		
	}

}

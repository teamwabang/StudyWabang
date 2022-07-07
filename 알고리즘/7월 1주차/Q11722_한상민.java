package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11722_한상민 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int b[] = new int[n];
		
		String line[] = br.readLine().split(" ");
		
		int result = 0;
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(line[i]);
			b[i] = 1;
			for(int j = i; j >= 0; j--) {
				if(a[i] < a[j] && b[i] <= b[j])
					b[i] = b[j] + 1;
			}
			result = Math.max(result, b[i]);
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
	}

}

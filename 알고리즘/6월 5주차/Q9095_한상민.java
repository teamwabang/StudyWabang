package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9095_한상민 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int arr[] = new int[11];
		arr[0] = 1;
		
		/*
		 * n-1 에 1, n-2 에 2, n-3 에 3을 더한 수
		 * arr[n] = arr[n-1] + arr[n-2] + arr[n-3]
		 */
		for(int i = 1; i <= 10; i++) {
			if(i >= 1)
				arr[i] += arr[i-1];
			if(i >= 2)
				arr[i] += arr[i-2];
			if(i >= 3)
				arr[i] += arr[i-3];
		}
		
		for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.append(String.valueOf(arr[n]));
            bw.newLine();
        }
		
		bw.flush();
		bw.close();
		br.close();

	}

}

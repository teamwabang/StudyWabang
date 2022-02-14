package algorithmstudyBOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2863_정재홍 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double [] arr = new double[4];
		double temp = 0;
		int highest = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		arr[0] = (double)a/c + (double)b/d;
		arr[1] = (double)c/d + (double)a/b;
		arr[2] = (double)d/b + (double)c/a;
		arr[3] = (double)b/a + (double)d/c;
		
		for(int i=0;i<4;i++) {
			if(arr[i] > temp) {
				temp = arr[i];
				highest = i;
			}
		}
		
		System.out.println(highest);

	}

}

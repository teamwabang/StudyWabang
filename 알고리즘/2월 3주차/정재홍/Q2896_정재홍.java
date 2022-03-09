package algorithmstudyBOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2896_정재홍 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		double c = Double.parseDouble(st.nextToken());
		st = new StringTokenizer(br.readLine());
		double i = Double.parseDouble(st.nextToken());
		double j = Double.parseDouble(st.nextToken());
		double k = Double.parseDouble(st.nextToken());
		double arr [] = new double[3];
		arr[0]=a/i;
		arr[1]=b/j;
		arr[2]=c/k;
		
		Arrays.sort(arr);
		System.out.print(a-arr[0]*i + " ");
		System.out.print(b-arr[0]*j + " ");
		System.out.print(c-arr[0]*k);

		

	}

}

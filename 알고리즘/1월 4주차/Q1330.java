package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1330 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else if(a == b) {
			System.out.println("==");
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		if(c > d) {
			System.out.println(">");
		} else if(c < d) {
			System.out.println("<");
		} else if(c == d) {
			System.out.println("==");
		}
	}

}

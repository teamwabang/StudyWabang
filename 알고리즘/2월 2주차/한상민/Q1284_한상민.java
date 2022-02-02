package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1284_한상민 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String space = br.readLine();
			
			int i = 0;
			if(space.charAt(i) == '0') break;
			int s = 2 + space.length() - 1;
			
			for(i = 0; i < space.length(); i++) {
				if(space.charAt(i) == '0') s += 4;
				else if(space.charAt(i) == '1') s += 2;
				else s += 3;
			}
			
			System.out.println(s);
		}
	}
}

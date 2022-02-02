package altudy;

import java.util.Scanner;

public class T_1284_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String k = sc.nextLine();
		int t = Integer.parseInt(k);
		int i;
		while(true) {
			if(t <= 0 && t > 9999 ) break;
			
/*int result = 2;
result += num.length() - 1;*/
			int space = 2;
			space += k.length()-1;
			
			for(i = 0; i < k.length(); i++) {
				String a = k.substring(i, i+1);
				if(a == "1") space += 2;
				else if(a == "0") space += 4;
				else space += 3;
			}
			
			System.out.println(space);
			break;
		}
	}

}
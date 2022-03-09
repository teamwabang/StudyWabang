package algorithmstudyBOJ;

import java.util.Scanner;

public class Q4153_정재홍{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			short a = sc.nextShort();
			short b = sc.nextShort();
			short c = sc.nextShort();
			
			int powera = a*a;
			int powerb = b*b;
			int powerc = c*c;
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			if(powerc == powera + powerb) {
				System.out.println("right");
			}  else {
				System.out.println("wrong");
			}
		}
	}

}

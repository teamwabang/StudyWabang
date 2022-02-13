package altudy;

import java.util.Scanner;

public class T_2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Hour = sc.nextInt();
		int Minute = sc.nextInt();
		
		if(Minute < 45) {
			Hour--;
			Minute = 60 - (45 - Minute);
			if(Hour < 0) {
				Hour = 23;
			}
			System.out.println(Hour + " " + Minute);
		}
		else {
			System.out.println(Hour + " " + (Minute - 45));
		}

	}

}

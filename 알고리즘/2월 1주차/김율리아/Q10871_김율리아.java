package backjoon;

import java.util.Scanner;

public class Q10871_김율리아 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

			int x = sc.nextInt();
			int a = sc.nextInt();
			for(int i = 0; i <x; i++) { 	
				int num = sc.nextInt();
					if (num<a){
						System.out.print(a+ " ");
					}//if
		}//for
	}//void
}

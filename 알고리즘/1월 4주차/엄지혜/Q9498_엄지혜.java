package test;

import java.util.Scanner;

public class B9498 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		in.close();
        
		System.out.println((N>=90) ? "A" : ((N>=80) ? "B" : ((N>=70) ? "C" : ((N>=60) ? "D" : "F" ))));
	}
 
}


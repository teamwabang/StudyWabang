package test;

import java.util.Scanner;

public class B1085 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		
		int WM = (w-x) < x ? (w-x) : x;
		int HM = (h-y) < y ? (h-y) : y; //Math.min 최솟값 사용도 가능
        
		if( WM < HM ) {
        	System.out.println( WM );
        }
        else {
        	System.out.println( HM );
        }
}
}

// 배열에 넣어서 Array.sort 사용도 가능 
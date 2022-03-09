package test;

import java.util.Scanner;

public class B1094 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	     int X = sc.nextInt();
	     int leng = 64; 
	     int cnt = 0;     
	     
	     while(X > 0) {
	    	 if(leng > X) {
	    		leng /= 2;
	    	 }
	    	 else {
	    		 X -= leng;
	    		 cnt++;
	    	 }
	     }
	     System.out.println(cnt);
	}
}

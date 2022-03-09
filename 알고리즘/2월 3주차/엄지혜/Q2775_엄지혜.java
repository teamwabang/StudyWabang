package test;

import java.util.Scanner;

public class B2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int N = sc.nextInt();
	    
	    for(int i = 0; i <= N; i++) {
	    		int k = sc.nextInt();
		    	int n = sc.nextInt();
		    	System.out.println(A(k,n));
	    }
	}
	
	public static int A(int k, int n) {
		int sum = 0;
		
		if(k==0) {
			return n;
		}
		else if(k==1) {
			for(int i = 1; i <= n; i++) { 
				sum += i;
			}
		}
		else{
			for(int i = 1; i <= n; i++) {                            
				sum += A(k-1, i);
				}    
			}
		return sum;
		}
	}
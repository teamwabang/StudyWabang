package test;

import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
	    
	    int[] arr = new int[10];
	    int i = A * B * C;
	    
	    while(i >0){
	    	arr[i%10]++;
            i /= 10;
        }

        for(i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

//다시 풀기

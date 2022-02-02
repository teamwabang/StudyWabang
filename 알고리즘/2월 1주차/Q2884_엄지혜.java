package test;

import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int aH = H;
        int aM = M - 45;
        
        if(aM < 0){
            aM += 60;
            aH--;
            if(aH < 0){
                aH += 24;
            }
        }
        
        System.out.println(aH + " " + aM);
        sc.close();
    }
}
package altudy;

import java.util.Scanner;

public class Q5565_박병권 {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        
        int price = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= 9; i++) {
            sum += sc.nextInt();
        }
        sc.close();       
        System.out.println(price - sum);
    }
}
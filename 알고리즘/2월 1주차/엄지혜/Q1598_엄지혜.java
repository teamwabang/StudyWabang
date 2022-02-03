package test;

import java.util.Scanner;

public class B1598 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x1, x2, y1, y2;  
        int result = 0;
        
        if (A % 4 == 0) {  
            x1 = 3;
            y1 = A / 4 - 1;
        }else {                   
            x1 = A % 4 - 1;
            y1 = A / 4;
        }
        
        if (B % 4 == 0) {
            x2 = 3;
            y2 = B / 4 - 1;
        }else {
            x2 = B % 4 - 1;
            y2 = B / 4;
        }
        
        result = x1 > x2 ? result + x1 - x2 : result + x2 - x1; 
        result = y1 > y2 ? result + y1 - y2 : result + y2 - y1;
        
        System.out.println(result);
        
 
    }
 
}

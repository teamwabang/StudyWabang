import java.util.Scanner;

public class Q2588_김율리아 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     
	        
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        int c = b/100; 
	        int d = (b/10)%10;
	        int e = b%10; 
	        

	        System.out.println(a*e);
	        System.out.println(a*d);
	        System.out.println(a*c);
	        int f = a*e;
	        int g = (a*d)*10;
	        int h = (a*c)*100; 
	        System.out.println(f+g+h);

	}

}

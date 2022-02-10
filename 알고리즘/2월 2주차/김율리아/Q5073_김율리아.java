import java.util.Scanner;

public class Q5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
	
			if(a == 0 && b == 0 && c == 0) break;
			
			if (c>=a+b || a>=b+c || b>=a+c ) System.out.println("Invalid");
			else if (a==b && b==c) System.out.println("Equilateral");
			else if(a==b || b==c || a==c) System.out.println("Isosceles");
			else if(a!=b && b!=c && a!=c) {System.out.println("Scalene ");	
		}
	}
  }
}

		



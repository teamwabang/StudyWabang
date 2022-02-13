import java.util.Scanner;

public class Q2583 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	
		int y = sc.nextInt();	
		int n = sc.nextInt();	
		double minPrice = (double)x/y * 1000;	
		
		for(int i=0; i<n; i++) {
			int p = sc.nextInt();	
			int g = sc.nextInt();	
			double price = (double)p/g * 1000;
			minPrice = Math.min(minPrice, price);
		}
		
		System.out.println(minPrice);
	}

}

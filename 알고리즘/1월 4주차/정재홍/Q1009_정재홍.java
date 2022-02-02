
import java.util.Scanner;

public class Q1009_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a, b, c;
		
		for(int i = 0; i<t ;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = 1;
			for(int j = 1;j<=b;j++) {
				c =((c*a)%10);
			}		
			if(c==0) {c=10;}
			
			System.out.println(c);
		}	
			
	}

}
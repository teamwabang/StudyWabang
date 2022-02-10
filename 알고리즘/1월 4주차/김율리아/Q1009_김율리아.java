import java.util.Scanner;

public class Q1009_김율리아 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a, b, r;
		for (int i=0; i<t; i++) {
			a = s.nextInt();
			b = s.nextInt();
			r = 1;
			for (int j=0; j<b; j++){
				r=a*r%10;
			}
			if (r==0) r=10;
			System.out.println(r);
		}   
	}
}

import java.util.Scanner;

public class Q1085_김율리아 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int a = Math.min(w-x, x);
		int b = Math.min(h-y, y);
		
		if(a<b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}

import java.util.Scanner;
//캥커루 3마리 점프
public class Q2965_김율리아 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// a<b<c
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(b-a > c-b ? b-a-1 : c-b-1);
	}
}

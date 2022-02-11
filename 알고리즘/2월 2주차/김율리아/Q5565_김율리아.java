import java.util.Scanner;

public class Q5565_김율리아 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int sum=0; 
		int a=0;
		for(int i=1 ; i<=9 ; i++) {
			 a = sc.nextInt();
			sum +=a;
		}	
		System.out.println(price-sum);
	}
}

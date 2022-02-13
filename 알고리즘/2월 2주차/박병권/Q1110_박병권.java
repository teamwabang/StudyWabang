import java.util.Scanner;

public class Q1110_박병권 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int num = x;		
		int cnt = 0;
		 
		do {
			//(x%10)*10 - x의 십의 자릿수
			//((x/10)+(x%10)%10) - x의 일의 자릿수
			x = ((x % 10) * 10) + (((x / 10) + (x % 10)) % 10); // 새로운 수
			cnt++;
		} while(num != x);
		System.out.println(cnt);
	}

}

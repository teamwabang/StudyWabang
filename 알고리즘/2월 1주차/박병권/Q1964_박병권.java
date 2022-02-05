import java.util.Scanner;

public class Q1964_박병권 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 5;
		
		for(int i = 1; i < n; i++) {
			sum += ( (i + 2) * 3 - 2 ) % 45678;
		} // 5 12 22 35 ... ~7 ~10 ~13 ...(i+2)*3-2
		
		System.out.println(sum);

	}

}
import java.util.Scanner;

//설탕배달
/*참고
  https://bit.ly/3pvsh43 유튜브 coin change
  https://bit.ly/3sxjz7u 블로그 
  */  
public class Q2839_김율리아 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		 int N = sc.nextInt();
				
			if (N == 4 || N == 7) {
				System.out.println(-1);
			}
			else if (N % 5 == 0) {
				System.out.println(N / 5);
			}
			else if (N % 5 == 1 || N % 5 == 3) {
				System.out.println((N / 5) + 1);
			}
			else if (N % 5 == 2 || N % 5 == 4) {
				System.out.println((N / 5) + 2);
			}
	}
}
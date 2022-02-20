import java.util.Scanner;

public class Q2884_김율리아 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		if(hour>0) {
			if(min>=45) {
				System.out.printf("%d %d", hour, min-45);
			}else
				System.out.printf("%d %d", hour-1, min+15);
			
		}else if (hour<=0) {
			if(min>=45) {
				System.out.printf("%d %d", hour, min-45);
			}else
				System.out.printf("%d %d", 23, min+15);
		}
	}

}

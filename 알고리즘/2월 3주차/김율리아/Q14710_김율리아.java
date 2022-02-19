import java.util.Scanner;

public class Q14710_김율리아 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();

		int angle = hour%30; //시침은 1시간에 30도 움직이므로
		
		if(angle*12 == min) {//각도의 이동 비율은 시침:분침 = 1:12이므로 
			System.out.println("O");
		}else
			System.out.println("X");	
	}
}

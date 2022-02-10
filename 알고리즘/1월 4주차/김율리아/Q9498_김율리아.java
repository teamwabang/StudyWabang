import java.util.Scanner;

public class Q9498_김율리아 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      
		 int a = sc.nextInt();
		 
		 if (90 <= a && a <=100) {
			 System.out.println("A");
		 }else if (a >= 80) {
			 System.out.println("B");
		 }else if (a >= 70) {
			 System.out.println("C");
		 }else if (a >= 60) {
			 System.out.println("D");
		 }else 
			 System.out.println("F");

	}

}

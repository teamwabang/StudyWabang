import java.util.Scanner;

public class Q3449_김율리아 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
	
		for(int i = 0; i<t ; i++) {
			int cnt=0;
			String ham1 = sc.nextLine();
			String ham2 = sc.nextLine();
			
			for(int j = 0; j<ham1.length(); j++) {
				if(ham1.charAt(j)!=ham2.charAt(j)) cnt++;
			}
			System.out.println("Hamming distance is "+ cnt + ".");
		}			
	}
}

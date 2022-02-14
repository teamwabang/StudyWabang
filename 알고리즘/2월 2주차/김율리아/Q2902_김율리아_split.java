import java.util.Scanner;
//kmp 이름 축약하기 
public class Q2902_김율리아_split {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String full = sc.nextLine();         
		String[] name = full.split("-"); //{knuth, morris, pratt}
		
		for(int i =0 ; i <name.length; i++) {
			String namecut = name[i];
			String[] upper = namecut.split("");
			
			System.out.print(upper[0]);	
		}
	}

}

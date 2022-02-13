import java.util.Scanner;
//kmp 이름 축약하기 - isUpperCase 사용

public class Q2902_김율리아_isUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String full = sc.nextLine();         
		
		
		for(int i =0; i<full.length();i++) {
			char ch=full.charAt(i);
	
			if(Character.isUpperCase(ch)==true) {
				System.out.print(full.charAt(i));}
		}

	}

}

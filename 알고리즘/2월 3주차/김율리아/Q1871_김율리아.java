import java.util.*;

public class Q1871_김율리아 {

	public static void main(String[] args) throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //번호판의 수 
		String [] fullArr = new String[2]; //한줄 문자
		String[] abcArr = new String[3];   //앞의 문자값(ex)ABC
		int[] ascii = new int[3];          // ABC → ASCII 숫자
		
		for(int i= 0; i<N; i++) {
			fullArr = sc.next().split("-"); // fullArr = { ABC, 0123}	
			
			for(int j=0; j<3 ; j++) {
				abcArr = fullArr[0].split(""); //abcArr ={ A, B, C}
				String arrayj = abcArr[j];
				char chari = arrayj.charAt(0); // A, B, C를 각각 char로 형변환 
				ascii[j] = (int) chari-65;     // → int 값으로 형변환
				
			} int sum = ascii[0]*26*26 + ascii[1]*26 + ascii[2]; //24진수, 문제에 제시된 계산법
			
			int val = Integer.parseInt(fullArr[1]); //fullArr[1] 인 [0123]을 int값으로 
			
			int good = Math.abs(sum-val); //절대값을 이용해 빼줌 
			
			if(good<=100) {
				System.out.println("nice");
			}else {
				System.out.println("not nice");
			}
		}
	}
}
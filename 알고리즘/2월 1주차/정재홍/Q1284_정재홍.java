
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1284_정재홍 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n;
		
		while(true) { //조건에 0이 들어오기 전까지 "계속" 출력
			n = br.readLine(); // 문자 하나씩 쪼개야하기 때문에 String type
			
			int result = 0; // 각 숫자들이 가지는 너비 수
			int space = 2 + n.length()-1; // 양 끝쪽과 숫자들 사이의 여백		
			
			for(int i=0;i<n.length();i++) {
				int word = n.charAt(i)-48;
				
				if(word== 1) {
					result += 2;
				} else if(word == 0) {
					result += 4;
				} else {
					result += 3;
				}
			}
			
			if(n.equals("0")) 
				break;	//0일 때 break
			System.out.println(result+space); //숫자들이 가지는 너비수 + 숫자들과 양끝 쪽 공백 수
		}
	}

}

import java.util.Scanner;

public class Q2386_김율리아 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			String alpa = sc.nextLine();         //String으로 문장을 받고
			alpa = alpa.replaceAll(" ", "");     //공백 다 없애주고
			String[] arr_alpa = alpa.split("");  //한개씩 배열에 넣어주고 
			int cnt = 0;
			
			if (arr_alpa[0].equals("#")) {       // 첫번째 값이 # 인 경우 끝내기
				sc.close();
				break;
			} 
			else { 
				for (int i = 1; i<arr_alpa.length ;i++) {  // 배열 길이 만큼 i값으로 비교 
					
					if(arr_alpa[0].equalsIgnoreCase(arr_alpa[i])) //equalsIgnorecase 사용시 대소문자 구분안함
						{cnt += 1;}                       // 개수 더해주는 것으로 +=1 해줌 
				
				}//for
				System.out.printf("%s %d", arr_alpa[0], cnt);
				System.out.println("");
			}//2nd if 
		}//while
	}
}



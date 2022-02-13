import java.util.Scanner;

//FBI 글자가 들어간 입력줄이 몇개인지 찾는 문제 
public class Q2857_김율리아 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] arr = new String[5];  //5명 중 찾는것이므로 배열크기는 5
		String mem= null;
		
		/* 
		 [for문을 이용해 arr배열에 요원 이름을 한명씩 넣음]
		  1.요원 이름의 입력과정을 최소화하기 위해서
		  2.몇번째에 입력받았는지 확인하기 위해서 
		 */
		for (int i = 0; i< 5; i++) {
			mem = sc.nextLine();
			arr[i] = mem;
		}
		
		//전체 이름에서 FBI가 포함되어 있는지 걸러야되므로 배열을 String으로 변환
		String full = String.join("", arr); 
		
		/* 
		 [총 2번 걸러줌]
		  1. 전체적으로 FBI가 들어간 첩보명이 있는가 
		    → 이점을 확인해야 HE GOT AWAY문을 반복없이 따로 1번만 실행할 수 있음
		  2. 있다면 for문을 활용해 해당 첩보원이 몇번째에 입력받았는지 확인
		 */
		if (full.contains("FBI")) { 		
			for(int i = 0; i<5; i++) {			
				if (arr[i].contains("FBI")) {    
				System.out.print((i+1)+" ");	 //입력받아던 순번을 출력하기 위해 i+1해줌
				} 								 //처음엔 else문으로 적어줬는데 리턴값이 애매하고 결과적으로 불필요해서 삭제함
			}	
		}else {
			System.out.println("HE GOT AWAY!"); 
		}
	}
}
package test;

import java.util.Scanner;

public class B2857 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int N = 0;
		
		String [] arr = new String[5];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine();
            
			if(arr[i].contains("FBI")) { //contain을 사용해 배열 안의 문자열 안에서 FBI 검색 
	           System.out.print(i+1 + " "); //배열은 0부터 시작이므로 +1을 해서 출력
	           N++; //배열 안의 모든 문자열에서 FBI가 없을 때를 찾기 위해 있을 때 N을 하나씩 증가
	           }
        }
		if(N == 0) { //각각의 문자열이 아니라 모든 문자열이기 때문에 for문 바깥에서 출력해야하므로 else는 사용 불가
        	System.out.println("HE GOT AWAY!");
		}
	}
}

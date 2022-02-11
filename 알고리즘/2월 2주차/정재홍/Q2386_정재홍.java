package algorithmstudyBOJ;

import java.util.Scanner;

public class Q2386_정재홍{

	public static void main(String[] args) {
		//1.charAt() : toLowerCase()는 인수로 String으로 받는데 charAt()은 char 타입
		//2.split("") : split("")을 이용하려 하였으나 띄어쓰기에서 막힘
		//3. 그러면 띄어쓰기 기준으로 먼저 나눈 후 문자단위로 나눠서 해보자
		Scanner sc = new Scanner(System.in);
		
        while(true) { //#이 나올 때까지 반복
        	int cnt = 0;//횟수
            String str = sc.nextLine();//입력 - nextLine()으로 한 이유 : 띄어쓰기가 랜덤하게 입력되므로 한줄씩 입력받는 걸로 결정 |g Programming contest|
            String strm = str.toLowerCase();//문제 조건에서 대소문자 구분이 없다하여 소문자로 모두 변경 |g programming contest|
            String [] arr = strm.split(" ");//1차로 띄어쓰기 기준으로 String을 나누어 배열에 저장 |[g, programming, contest]|
            String [] arr2 = new String[100];//문자단위로 나눠 저장할 배열 선언

            if(arr[0].equals("#")) break;//입력으로 주어진 소문자 즉, arr[0]이 #과 같다면 break; 

            for(int i = 1; i < arr.length; i++) {//i=1인 이유 : i=0일 때 즉,arr[0]은 비교할 문자이기 때문에  우리가 의도한 입력 String값은 index = 1부터 시작. |[g, programming, contest] 문자열을 문자단위로 잘라야 하기 때문에 i=1부터 시작|
	            for(int j = 0; j < arr[i].length(); j++) {//띄어쓰기 기준으로 잘라놓은 String들을 문자단위로 자르기위해 for문 활용
	                String A = arr[i];//띄어쓰기 단위로 잘린 i번째 문자 String A에 저장
	                arr2 = A.split("");//A를 문자단위로 자른 후 arr2배열에 저장 |[p,r,o,g,r,a,m,m,i,n,g,c,o,n,t,e,s,t]|
	                if(arr[0].equals(arr2[j])) {//arr[0] 원소 즉, 비교해야할 알파벳 과 arr2[j] 원소 즉, 문자단위로 잘린 배열의 원소들을 비교하여 같다면? |g와 [p,r,o,g,r,a,m,m,i,n,g,c,o,n,t,e,s,t] 각각 비교|
	                cnt += 1; //cnt 1증가
	                }
	            }
            }     
           System.out.print(arr[0] + " ");
           System.out.println(cnt);
        }                    
	}       
}


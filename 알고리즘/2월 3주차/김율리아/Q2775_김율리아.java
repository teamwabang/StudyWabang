import java.util.Arrays;
import java.util.Scanner;

public class Q2775_김율리아{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int t = sc.nextInt(); //testcase
		int k=0;              //k층
		int n=0;;			  //n호
		
		for(int j= 1; j<=t; j++) {
			k = sc.nextInt();
			sc.nextLine();
			n = sc.nextInt();
		
			//0층일때의 배열값
			int[] floor0 = new int[14];
			for(int i=0 ; i<14; i++) {  //1~14까지의 숫자를 순서대로 입력
				floor0[i] = i+1;		
			}
		
			
			//1층일때 배열값
			int[] floor1 = new int[14]; 
				for(int i=1; i<14; i++) {
					floor1[0]=1;
					floor1[i]=floor1[i-1]+floor0[i];	
				}
				
			int[] floorn = new int[14];
			int[] temp = new int[14]; 
					
			//k=0 일 때
			if(k==0) { 
				System.out.println(floor0[n-1]);
			}
			//k=1 일 때
			else if (k==1) { 
				System.out.println((floor1[n-1]));
			}
			//k>=2 일때
			if (k>1) {
				//1층일때의 값을 temp배열에 복사
				temp = floor1.clone();         
				
				//k값 전까지 for문 반복->2층부터 시작하므로 
				for(int h = 1; h<k;h++) {				 
					for(int i=1; i<14; i++) {//한 층의 값을 다 리턴
						floorn[0]=1; //1호는 1명으로 고정값
						//원하는 층의 사람수=같은층 옆집까지의 누적수+아래집호수
						floorn[i]=floorn[i-1]+temp[i];	 

					}
					//만들어낸 한층 값을 temp에 저장하고 이를 바탕으로 다시 윗층값에 대입
				    temp = floorn.clone();				
				}	
				System.out.println(floorn[n-1]);
			}//층별값 for문
		}//sc for문
	}
}

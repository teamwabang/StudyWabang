import java.io.*;
import java.util.*;
//부재중전화
public class Q1333_김율리아 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int l=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		
		
		boolean time[]=new boolean[n*l+5*(n-1)]; //전체 노래 재생 시간 = 노래시간(n*1) + 노래안나오는시간5*(n-1) 
		
		for(int i=0;i<n;i++) { //n = 곡수   (노래 안나오는 시간은 나오는 시간보다 한번 횟수가 적으므로 범위를 <n까지) 
			int s=(l+5)*i;     // s : 노래가 안나오는 시간 
			System.out.println("s= "+s);
			for(int j=s ; j<s+l ; j++) { // 노래 안나오는 시간~노래나오는 시간 전 사이까지를 범위일 때 
				time[j]=true;  // 노래 나오는 시간은 true / 안나오는 시간은 false 
			}
		}
		System.out.println(Arrays.toString(time));
		
		int bell=0;
		while(bell<time.length) {   // 전체 노래 나오는 시간의 길이가 벨소리보다 작을때 
			System.out.println("bell="+bell);
			System.out.println("조건" + time[bell]);
			if(!time[bell]) 
				break;  
				bell+=d;
				System.out.println("조건j");
			//벨소리 값이 'true=노래 나오는 시간' 이면 d값만큼 더해줌 - 중괄호 생략이므로 무조건 실행 
			//벨소리 값이 'false=노래 안나오는시간' 이면 break에 걸려서 if문 나와서 출력 
		}
		System.out.println(bell);
	}
}


/* 벨소리가 들리는 경우는 크게 2가지 이다. 
 * 1. 노래 안나오는 시간과 노래나오는 시간 사이가 d값의 배수가 겹칠 때 
 *     L*i  < D*i <= i(L+5) 
 *      곡수 n : 6
		노래 l  : 9
		노래 x :5 
		벨소리 d : 20   
		9                               소리        9
		9+5              x     9 ~ 14
		9+5+9                       소리       14 ~23     20 
		9+5+9+5          x     23~28
		9+5+9+5+9   	 소리       28~37    
		9+5+9+5+9+5		 x     37~42      40 
 * 2. 1에서 겹치는 시간대가 없어서 전체 노래가 끝나고 벨소리가 울릴 때 
 */

import java.util.*;

public class Q1652_김율리아 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		//주어진 조언이 NxN형식이므로 2차원 배열을 사용해야겠다고 생각함
		String[][] arr = new String[N][N];
	
		int cnt = 0; 
		int cnt2 = 0; 
		int row = 0; 
		int column = 0;
		
		//입력받은 것을 for문을 이용해 2차원 배열에 하나씩 잘라서 삽입
		for(int i=0; i<N; i++) {
			String[] line = sc.next().split("");
			for(int j=0; j<N; j++) {
	             arr[i][j] = line[j];
			}
		}
		
		//전체 N번만큼 for문 돌림		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				//##가로
				//빈 칸이 있을때 cnt++
				if(arr[i][j].equals(".")) {
					cnt++;
				}
				//짐이 있거나 마지막 값까지 조회했을때 cnt값 초기화 
				//이때 cnt값이 2이상이라면 row++
				if(arr[i][j].equals("X")||(j==N-1)) {
					if(cnt>=2) { 
						row++;
					}
					cnt=0;
				}
				//##세로
				//j,i값 변경해서 세로 자리 조회
				if(arr[j][i].equals(".")) {
					cnt2++;
				}
				//짐이 있거나 마지막 값까지 조회했을때 cnt값 초기화 
				//이때 cnt값이 2이상이라면 column++
				if(arr[j][i].equals("X")||(j==N-1)) {
					if(cnt2>=2) column++;
					cnt2=0;
				}
			}		
		}
		System.out.println(row + " " +column);			
	}//main
}//class	


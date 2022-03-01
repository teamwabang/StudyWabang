import java.util.Scanner;

public class Q2167_김율리아 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt(); 
		
		int[][] arr = new int[a][b];
		
		for(int i = 0; i <a; i++) {
			for(int j = 0; j<b; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 출력할 갯수 k개 - for문으로 돌리기 
		int k = sc.nextInt();
		
		//4개의 정수 i, j, x, y 
		int[] num = new int[4];
		int sum;
		
		for(int j = 0; j<k; j++ ) {
			sum = 0;
			
			//for문을 이용하여  num배열에 값 입력
			for(int i = 0; i<4 ; i++) {
				num[i]= sc.nextInt();
			}
			//num[] = {i, j, x, y} 이므로 x값과 y값끼리 분리하여 2차원 배열에 입력
			//sum +=을 이용해 누적합 구함 
			for(int h = num[0]-1; h <num[2]; h++) {
				for(int g = num[1]-1; g<num[3]; g++) {
					sum += arr[h][g];
				}
			}
			System.out.println(sum);
		}
	}

}

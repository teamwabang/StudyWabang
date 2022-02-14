package test;

import java.util.*;

public class B2863{
	public static void main(String[] args) {
        //가장 작을 때만 출력하는 것이므로 처음으로 다시 돌아 올 때까지의 값들만 비교하면 된다.
		//처음엔 배열에 넣어 sort를 사용하려고 했지만 max값이 아닌 몇 번 돌아갔는 지를 구하는 것이므로 for문을 이용했다.
		//int로 값을 받았지만 마지막 큰 수가 들어있는 예제가 제대로 실행되지 않아 double타입으로 변경했다.
		Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double D = sc.nextDouble();
        
        double [] arr = new double[4]; 
        double max = 0;
        int N = 0;
        
        arr[0] = A/C+B/D; //배열에 넣는다
        arr[1] = C/D+A/B;
        arr[2] = D/B+C/A;
        arr[3] = B/A+D/C;
        
        for(int i = 0; i < 4; i++) { //max값을 구한다.
			if(max < arr[i]) {
				max = arr[i];
				N = i; //몇 번 반복되었는 지를 구해야하므로 i값을 N에 저장한다.
			}
		}
		System.out.println(N);
	}    
}

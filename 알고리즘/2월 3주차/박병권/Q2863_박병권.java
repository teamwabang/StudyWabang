package altudy;

import java.util.Scanner;

public class Q2863_박병권 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr1 = new int [2];
		int [] arr2 = new int [2];
		double [] sum = new double [5]; //문제의 포인트는 초기 상태는 1회전으로 두지 않는다.
		for(int i =0; i < arr1.length; i++) {
			arr1[i] = scan.nextInt();
			}
		for(int i =0; i < arr2.length; i++) {
			arr2[i] = scan.nextInt(); 
			} //다중 배열이 아닌 배열 2개를 사용했다.
		double max = sum[0];
		int count = 0;
		for(int i = 1; i <= 4; i++) {
			int temp1 = arr1[0];
			int temp2 = arr1[1]; //임시 변수를 만들어 옮길 배열을 //잠시 담아두었다.
			arr1[0] = arr2[0];
			arr1[1] = temp1;
			arr2[0] = arr2[1];
			arr2[1] = temp2;
			sum[i] = (arr1[0] / arr2[0]) + (arr1[1] / arr2[1]); //분자가 클수롤 그 값은 큰 값이기 때문에 /(몫) 연산을 사용
			if(max < sum[i]) { max = sum[i]; count = i; //기존값과 비교
			}
		}
		System.out.println(count);
	}
}

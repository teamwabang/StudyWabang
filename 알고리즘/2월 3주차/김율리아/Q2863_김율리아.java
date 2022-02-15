import java.io.*;
import java.util.*;


public class Q2863_김율리아 {

	public static void main(String[] args) throws IOException {
		
		//공백으로 구분되며 한줄에 값 2개씩 넣어짐 => 배열이용
		//분수값이므로 int가 아닌 double사용
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr1 = new double[2];
		double[] arr2 = new double[2];
		
		for(int i=0; i<arr1.length;i++) {
			arr1[i] = sc.nextDouble();
		}
		

		for(int i=0; i<arr1.length;i++) {
			arr2[i] = sc.nextDouble();
		}
	
		double[] sum = new double[4];
		
		sum[0] = (arr1[0]/arr2[0]) + (arr1[1]/arr2[1]);
		sum[1] = (arr2[0]/arr2[1]) + (arr1[0]/arr1[1]);
		sum[2] = (arr2[1]/arr1[1]) + (arr2[0]/arr1[0]);
		sum[3] = (arr1[1]/arr1[0]) + (arr2[1]/arr2[0]);
		
		double max = 0;
		int cnt = 0;
	
		for (int i=0 ; i<4; i++) {
			if (max < sum[i]) {
				max = sum[i];
				cnt = i;
			}
		}
		System.out.println(cnt);
	}	
}

package algorithmstudyBOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Q5073_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [3];
		
		
		while(true) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		if(arr[0]==0 && arr[1]==0 && arr[2]==0) {
			break;
		}
		if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[0]) {
			System.out.println("Equilateral");
		} else if (arr[2] >= arr[0] + arr[1]) {
			System.out.println("Invalid");
		} else if ((arr[0]==arr[1] && arr[0] != arr[2]) || (arr[1]==arr[2] && arr[1] != arr[0]) || (arr[0]==arr[2] && arr[0] != arr[1])) {
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}
		}
		
		

	}

}

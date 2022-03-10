package algorithmstudyBOJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q1427_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		Integer[] arr = new Integer[n.length()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int) n.charAt(i)-48;
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		for(Integer s : arr) {
			System.out.print(s);
		}
	}

}

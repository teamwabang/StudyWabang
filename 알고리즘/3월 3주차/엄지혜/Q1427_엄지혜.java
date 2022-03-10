package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String[] arr = N.split("");
		
		Arrays.sort(arr, Comparator.reverseOrder());
		for (String s : arr) {
			System.out.print(s);
		}
	}
}

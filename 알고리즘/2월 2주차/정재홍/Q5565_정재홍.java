package algorithmstudyBOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Q5565_정재홍{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0; //가격을 읽을 수 없는 책을 제외한 나머지 9권책 값의 합
		int [] arr = new int [10];//입력을 받을 배열 선언
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}//입력
		
		Arrays.sort(arr);//오름차순정렬 - 10권의 총 가격이 마지막 인덱스
		for(int i=0;i<9;i++) {
			total += arr[i];
		} //총 가격을 제외한 9권의 책 총합을 total에 저장
		
		System.out.println(arr[9] - total);//총 가격 - 9권의 책값

	}

}

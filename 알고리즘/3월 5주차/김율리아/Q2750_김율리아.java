package backjoon;

import java.util.*;

public class Q2750_김율리아 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//N개 하나씩 list에 입력 
		//N값이 가변적이므로 list사용
		int N = sc.nextInt(); 
		for(int i = 0; i<N; i++) {
			arr.add(sc.nextInt());
		}
		
		//정렬
		Collections.sort(arr);
		//한줄씩 띄워서 출력
		for(int i=0; i<N ; i++) {
			System.out.print(arr.get(i));
			System.out.println("");
		}
	}
}

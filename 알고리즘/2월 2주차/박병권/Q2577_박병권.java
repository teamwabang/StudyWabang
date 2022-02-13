import java.util.Scanner;

public class Q2577_박병권 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int cnt[] = new int[10]; // 배열생성
		int num = x * y * z;
		while(num > 0) {
			cnt[num % 10]++; // 곱한 값 10으로 나눈 나머지 카운트
			num = num / 10; // 10으로 나눈값 저장
		}
		int i;
		for(i = 0; i < cnt.length; i++) { 
			System.out.println(cnt[i]); // 카운트한 갯수 출력
		}
		
				
	}

}

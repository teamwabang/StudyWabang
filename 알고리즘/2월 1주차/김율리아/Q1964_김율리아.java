package backjoon;
import java.util.Scanner;

//오각수 등차수열
public class Q1964_김율리아 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = 3;
		long sum = 0;
		int mod = 45678;
		
		for (int i = 1; i <= n; i++) {
			if(i>=2) {
				sum+= i*5-d;
				d +=2;
				continue;
			}
			sum += i*5;
		}
		
		/*
		 *   5      12      22      35 
		 *      7      10       13
		 *   
		 *   7부터 시작해서 3씩 증가하는 값이 계속해서 더해지는 패턴
		 *   - 규칙성이 필요하므로 i를 어딘가에 곱해줘야 하는데 5에 계속 곱하는 것으로는 답이 나오지 않음
		 *   - 1→5 이므로 1인 경우와 2이상인 경우 분리가 필요했음
		 *   - 2 이상일때 5에 3이 곱해져야 최소 12이상의 값을 구할 수 있으므로 일단 5*3이 되어야 했으므로
		 *     i가 1일때의 값인 5 + 5*2(이때 2는 2번째 이므로) - 3(등차수열) 해줘서 구함
		 *   - 세번째부터 5 + 5*3 -3 = 17 이므로 올바른 값이 나오지 않음(답은 22)
		 *   - 위의 단계처럼 앞에서 나온 값을 다시 대입해주는 패턴이 필요하다고 생각
		 *   - '12(i가 2일때의 등차수열합)' + 5*3(3번째 경우이므로) - 3(등차수열) = 24(답 22) 이므로 2가 더 빠져야 됨
		 *   	그래서 d값이 2씩 증가하는 예시를 들어봄
		 *   - 22 + 5*4 - 7 = 35 이므로 4일 경우의 닶이 맞음 
		 *   	그래서 d가 2씩 증가하는 규칙도 추가해줘야 한다고 가정을 하고 공식을 세움 
		 *   -  i = 1 →  5 
		 *      i = 2 →  5 + 5 * 2 - 3 = 12
		 *      i = 3 → 12 + 5 * 3 - 5 = 22
		 *      i = 4 → 22 + 5 * 4 - 7 = 35
		 */
		
		System.out.println(sum%mod);
	}
}

/* ===================================================
 * 	//등차수열공식 이용해 봤으나 오답으로 나왔음 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()+1;
		int a = 1;//2a
		int d = 3;
		long sum = 0;
		int mod = 45678;
		
		for (int i = 1; i<=n ; i++) {
			sum = n*((3*n)-1);   //n*(2*a+((n-1)*3)); 
			sum = sum/2;	 	 //등차수열의 합 
		}
		System.out.println(sum%mod);
	}
}
*/


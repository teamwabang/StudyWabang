import java.util.Scanner;

//저항
public class Q1076_김율리아 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 값이 0부터 시작하니깐 -> 배열사용 -> 색의 값도 있으니 2차원 배열 
		// 값의 숫자는 곱에서 0의 개수 같음 
		String[][] arr= {
				{"black","brown","red","orange","yellow","green","blue","violet","grey","white"},
				{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
		};
		
		String first = sc.nextLine();
		String second = sc.nextLine();
		String third = sc.nextLine();
		
		String a = "";
		String b = ""; 
		String c = "";
		
		// 첫 번째줄 값 
		for(int i = 0; i<10; i++) {
			if(first.equals(arr[0][i])) {
				a = arr[1][i];
			}
		}
			
		// 두 번째줄 값 
		for(int i = 0; i<10; i++) {
			if(second.equals(arr[0][i])) {
				b = arr[1][i];
			}
		}
		
		// 문자형식으로 a+b 붙여준 뒤 int값으로 변경 
		int sum = Integer.parseInt(a+b);		
		
		
		// 세 번째줄 값
		for(int i = 0; i<10; i++) {
			if(third.equals(arr[0][i])) {
				c = arr[1][i];
			}
		}
		
		// c값 int값으로 변경
		int back = Integer.parseInt(c);
		// white범위가 넘어가므로 long값으로 받음
		long ten = 1; 
		
		
		//index가 0일때는 10을 곱해줄 필요가 없으므로 분리했음 
		if(back==0) {
			System.out.println(sum);
		}else {
			//for문을 이용하여 c값만큼 10을 곱해줘서 자릿수를 늘려나감 
			for(int i=1; i<=back ; i++ ) {
				ten *= 10;
			}
			System.out.println(sum*ten);
		}
	}
}


/*  
 * (참고) 간단한 풀이 
 *  int a에 10을 곱해서 십의 자릿수로 만들어 준 뒤 int b값을 더애줌
 *  Math.pow를 이용해서 거듭제곱을 해줌 
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        int a = Arrays.asList(colors).indexOf(br.readLine()) * 10;
        int b = Arrays.asList(colors).indexOf(br.readLine());
        int c = Arrays.asList(colors).indexOf(br.readLine());

        int front = a + b;
        long result = (long)(front * Math.pow(10, c));
        System.out.println(result);
 * */

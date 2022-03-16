import java.util.*;

public class Q1427_김율리아 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		//입력받는 길이가 가변적이므로 arraylist사용
		ArrayList<String> arr = new ArrayList<String>();
		
		//공백을 기준으로 잘라서 배열에 넣어줌
		for(String i : num.split("")) {
			arr.add(i);
		}
		
		//내림차순 정렬
		Collections.sort(arr, Collections.reverseOrder());
		
		//arraylist 값 출력
		int length = arr.size();
		for (int i = 0;  i<length ; i++ ) {
			System.out.print(arr.get(i));
		}
	}
}

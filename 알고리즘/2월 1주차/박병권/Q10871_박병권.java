import java.util.Scanner;

public class Q10871_박병권 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[z];
		
		for(int i = 0; i < z; i++) {
			arr[i] = sc.nextInt();
		}		
		for(int i = 0; i < z; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}

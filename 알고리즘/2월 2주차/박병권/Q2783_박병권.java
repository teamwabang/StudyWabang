import java.util.Arrays;
import java.util.Scanner;

public class Q2783_박병권 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(); // x원
        int y = sc.nextInt(); // y그램
        int n = sc.nextInt(); // 편의점 갯수
        double arr[] = new double[n+1]; // 1000그램 가격
        arr[0] = (double)x/y;        
        for(int i = 0; i < n; i++) {
            int x_1 = sc.nextInt(); // 가격
            int y_1 = sc.nextInt(); // 그램
            arr[i+1] = (double)x_1 / y_1;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]*1000);
	/*	for(int i=0; i<n; i++) {
			int x2 = scan.nextInt();	// 가격
			int y2 = scan.nextInt();	// 그램
			double price = (double)X1/Y1 * 1000;
			minPrice = Math.min(minPrice, price);
		}
	*/
	}
	
}
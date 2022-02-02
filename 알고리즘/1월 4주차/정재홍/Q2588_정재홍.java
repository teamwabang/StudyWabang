
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2588_정재홍 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int l3, l4, l5, l6;
		
		l3 = a*(b%10);
		l4 = a*((b%100)/10);
		l5 = a*(b/100);
		l6 = a*b;
		
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);
		System.out.println(l6);
		
	}

}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2739_정재홍 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=9;i++) {	
			System.out.printf("%d * %d = %d\n", n, i, n*i);

		}

	}

}

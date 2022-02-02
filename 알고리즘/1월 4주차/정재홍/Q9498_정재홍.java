
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9498_정재홍 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		if(n>=90) {
			System.out.println("A");
		} else if(n>=80){
			System.out.println("B");
		} else if(n>=70){
			System.out.println("C");
		} else if(n>=60){
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		System.out.println((n>=90) ? "A" : ((n>=80) ? "B" : ((n>=70) ? "C" : ((n>=60) ? "D" : "F" ))));

		
		

	}

}

import java.util.*;

public class Q5597_김율리아 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[] num = new int[28];
		
		
		for(int i=0; i<28; i++) {
			num[i] = sc.nextInt();
		}
		 
		Arrays.sort(num);

	
		for(int i=1; i<=30; i++) {
			boolean check = Arrays.binarySearch(num, i)>=0;

			if(check==false) {
				System.out.println(i);
			}
		}
	}
}

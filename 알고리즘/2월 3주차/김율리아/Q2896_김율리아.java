import java.util.*;

public class Q2896_김율리아 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		double [] fruit = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
		double [] ratio = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};

		double min1 = fruit[0]/ratio[0]; 
		double min2 = fruit[1]/ratio[1];
		double min3 = fruit[2]/ratio[2];
		
		double min_mid = Math.min(min1, min2);
		double min_final = Math.min(min_mid, min3);

		for(int i = 0 ; i<=2; i++) {
			System.out.print(fruit[i]-min_final*ratio[i] +" ");
		}
	}

}

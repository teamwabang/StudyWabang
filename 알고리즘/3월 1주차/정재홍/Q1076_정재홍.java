package standard;

import java.util.HashMap;
import java.util.Scanner;

public class Q1076_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("black", "0,1");
		map.put("brown", "1,10");
		map.put("red", "2,100");
		map.put("orange", "3,1000");
		map.put("yellow", "4,10000");
		map.put("green", "5,100000");
		map.put("blue", "6,1000000");
		map.put("violet", "7,10000000");
		map.put("grey", "8,100000000");
		map.put("white", "9,1000000000");
		
		String first = sc.next();
		String second = sc.next();
		String third = sc.next();
		
		String [] a = map.get(first).split(",");
		String [] b = map.get(second).split(",");
		String [] c = map.get(third).split(",");
		
		Long result = Long.parseLong(a[0]+b[0]) * Long.parseLong(c[1]);
		System.out.println(result);
	}

}

package algorithmstudyBOJ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1302_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	
		for(int i=0;i<n;i++) {
			String bookTitle = sc.next();
			
			if(map.containsKey(bookTitle)) {
				map.put(bookTitle, map.get(bookTitle)+1);
			} else {
				map.put(bookTitle, 1);
			}
		}
		
		/* entrySet() -> key/value  |  keySet() -> key
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());			
		}*/
		
		int max = 0;
		String result ="";
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(max < entry.getValue()) {
				max = entry.getValue();
				result = entry.getKey();
			} else if(max == entry.getValue()) {
				if(result.compareTo(entry.getKey()) > 0)
					result = entry.getKey();
			}
		}
		System.out.println(result);
		
	}

}

package algorithmstudyBOJ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q10546_정재홍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int n = sc.nextInt();
		
		for(int i=0;i<n*2-1;i++) {
			String person = sc.next();
			
			if(map.containsKey(person)) {
				map.put(person, map.get(person) + 1);
			} else {
				map.put(person, 1);
			}
		}
		
		/*
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		*/
		
		String result="";
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()%2 == 1) {
				result = entry.getKey();
			}
		}
		
		System.out.println(result);

	}

}

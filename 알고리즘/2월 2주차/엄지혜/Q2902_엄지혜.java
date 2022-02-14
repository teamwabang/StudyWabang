package test;

import java.util.Scanner;

public class B2902 {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		 
			String str = sc.nextLine(); 
			String [] arr = str.split("-"); 
			String [] arr2 = new String[250];
			
    		for(int i = 0; i < arr.length; i++) { 
    		for(int j = 0; j < arr[i].length(); j++) {
    			String A = arr[i];
    			arr2 = A.split(""); 
		 }
    		System.out.print(arr2[0]);
    	}
    }
}

/* public class B2902two {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		 
			String input = sc.nextLine();
			char output = '?';
			int tmp;
			
			for(int i = 0; i < input.length(); i++) {
				tmp = (int)input.charAt(i);
				
				if((65 <= tmp)&&(tmp <= 90)) {
					output = (char)tmp; 
					
					System.out.print(output);
				}
			}
	}
}*/


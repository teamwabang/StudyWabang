package test;

import java.util.Scanner;

public class B2386 {

    public static void main(String[] args) {
        // 와일로 반복, #이면 브레이크 애들은 잘라서 배열에 넣는다 배열 안을 다 소문자로 바꾼 포문으로 ++ 출력
    	// 2 반복 중첩으로 띄어쓰기 기준으로 여러 단어를 한 배열에 넣는다
    	// 3 split(" ")로 띄어쓰기 기준으로 배열에 넣기, 포문으로 안에 있는 문자열을 다시 하나씩 나눈 뒤 넣는다
    	
    	Scanner sc = new Scanner(System.in);
    		 
    		while(true) {
    			int cnt = 0;
    			String str = sc.nextLine();
    			String strm = str.toLowerCase();
    			String [] arr = strm.split(" ");
    			String [] arr2 = new String[100];
    			
	    		if(arr[0].equals("#")) break;
	    		
	    		for(int i = 1; i < arr.length; i++) {
	    		for(int j = 0; j < arr[i].length(); j++) {
	    			String A = arr[i];
	    			arr2 = A.split("");
		           
	    			if(arr[0].equals(arr2[j]))
		                    cnt += 1;
		    		 }
	    			}
	    		System.out.println(arr[0] + " " + cnt);
    		 }

    		}
    }






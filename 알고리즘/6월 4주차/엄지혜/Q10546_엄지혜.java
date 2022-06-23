package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B10546 {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
        Map<String, Integer> run = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            String key = sc.next();
        if(run.get(key) == null) {
        	run.put(key, 1);
        }else {
        	run.put(key, run.get(key) + 1);
        }
    }
        //참여한 사람을 저장
        
        for (int i = 0; i < n - 1; i++) {
            String key = sc.next();
            run.put(key, run.get(key) - 1);
        }
        
        //map value 값 -1
        for (String key : run.keySet()) {
            if (run.get(key) == 1) System.out.println(key);
        }

    }
}

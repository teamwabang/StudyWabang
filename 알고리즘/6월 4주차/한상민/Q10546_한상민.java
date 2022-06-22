package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q10546_한상민 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		/*
		 * 동명이인이 존재하지 않으면 map에 새로 추가, 동명이인이 존재하면 +1 을 해준다.
		 */
		for(int i = 0; i < n; i++) {
			String name = br.readLine();
			
			// containskey = map에서 key가 있는지 없는지 확인할 때 사용
			if(!map.containsKey(name))
				map.put(name, 1);
			else
				map.put(name, map.get(name) + 1);
		}
		
		/*
		 * 완주한 참가자 명단
		 * name 값이 1일 경우 map에서 삭제, 그렇지 않을 경우에는 -1 을 해준다.
		 */
		for(int i = 0; i < n-1; i++) {
			String name = br.readLine();
			
			if(map.get(name) == 1)
				map.remove(name);
			else
				map.put(name, map.get(name) - 1);
		}
		
		/*
		 * 참가자 명단 출력
		 */
		for(String name : map.keySet())
			System.out.println(name);
		
	}

}

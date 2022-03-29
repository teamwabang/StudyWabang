package backjoon;

import java.util.*;

public class Q1302_김율리아 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//N개 만큼 값을 받음 
		int N = sc.nextInt();
		String [] arr = new String[N];
		
		//문제에 표기된 알고리즘 분류가 해시를 사용한 집합과 맵이므로 '맵'을 써야겠다고 생각함
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.next();
			if(!hashmap.containsKey(arr[i])) {
				//map에 안 들어가 있으면 
				//key값 넣어주고 value는 1을 넣어줌
				hashmap.put(arr[i], 1);
			}else if(hashmap.containsKey(arr[i])) {
				//map에 들어가 있으면 
				//key별로 개수를 세어야 하므로 해당 key값의 value값에 +1 해줌
				hashmap.put(arr[i], hashmap.get(arr[i])+1);
			}		
		}
		
		/*## 저장된 key, value값 확인용
		  for(String i : hashmap.keySet()){ 
			  System.out.println("[Key]:" + i + " [Value]:" + hashmap.get(i));
		  }
		*/
		
		// ## value값 중 최대값 찾기 
		int maxValue = Collections.max(hashmap.values());
			
		List<String> list = new ArrayList<>();
		
		//##value의 최대값을 이용하여 해당 value의 key값을 list에 넣어줌
		
		//Map.Entry의 getKey는 Map.Entry의 getKey 메소드를 사용하므로 for문으로 하나씩 대조
		//메소드 entrySet은 Map의 데이터를 담고 있는 Set을 반환
		//반환한 Set의 값이 사용할 데이터 타입은 Map.Entry
		//Map.Entry은 인터페이스로 getKey, getValue API를 가지고 있음
		for(Map.Entry<String, Integer> map : hashmap.entrySet()) {
			//value값이 중복인 경우가 있을수 있으므로 
			// maxValue와 value값이 동일한 모든 값 list에 넣음
			if(map.getValue().equals(maxValue)) {
				list.add(map.getKey());
			}
		}
		
		//list정렬
		Collections.sort(list);
		//list에 들어가는 값이 1개 이상일 수 있으므로 index를 0으로 설정하여 첫번째 값만 출력
		System.out.println(list.get(0));
	}
}

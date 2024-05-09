package kr.exam.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
	
	public static void main(String[] args) {
		
		// key 거, value 거 데이터 형태 선언
		Map<String, Integer> map = new HashMap<>();
		
		// 삽입 put(key, value);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		
		System.out.println(map);
		
		// 치환 key 중복 관련
		// 중복일 경우 value 치환
		map.put("five", 55);
		
		System.out.println(map);
		
		// replace : 진짜 치환
		map.replace("one", 11);
		
		System.out.println(map);
		
		// 치환 없이 데이터 삽입
		// 중복일 경우 value 무시
		map.putIfAbsent("six", 6);
		map.putIfAbsent("two", 22);
		
		System.out.println(map);
		
		// 삭제 - remove(key);
		// key값 가지고 삭제
		map.remove("three");
		
		System.out.println(map);

		// 키와 값이 모두 동일한 것을 삭제
		map.remove("six", 6);
		
		System.out.println(map);
		
		// 삭제 여부를 리턴
		boolean isDelete = map.remove("six", 6);
		
		System.out.println(isDelete);
		
		System.out.println("크기 = " + map.size());
		
		// 키 존재 유무 판단
		System.out.println(map.containsKey("four"));
		
		// 값 존재 유무 판단
		System.out.println(map.containsValue(22));		
		
		// 출력 - key를 이용한 방법
		// key를 set으로 반환해줌
		// key는 중복되면 안되기 때문에
		// Set은 순서가 없음 = 인덱스가 없음 = 여태 학습했던 기능으로는 뽑을 수 없음 = 그래서 신규 for문을 배울 것임 = foreach
		Set<String> keys = map.keySet();
		
		// 향상된 for문 - foreach
		// key에 있는 값 하나를 꺼내서 str에 넣음
		// 값을 꺼내는 것은 get(key)
		for(String key : keys) {
//			System.out.println(map.get(keys));
			// 4, 11, 2, 55가 출력되어야 되는데 null이 나옴 뭐지?
			System.out.println(map.get(key));
			// 변수명을 입력해줘야됐음
		}
		
		System.out.println("----------");
		
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(map.get(key));
		}
		
	}

}

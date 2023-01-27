package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();
		
		// 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		// set의 경우 하나만 저장되어서 key를 우선적으로 set으로 만들어줍니다.
		Set<String> keySet = map.keySet();					// key로 set을 만들고
		Iterator<String> keyIterator = keySet.iterator();	// keySet 이용해서 Iterator
		while(keyIterator.hasNext()) {						// set에 값이 있는지 확인 : 값 없으면 실행 X
			String k = keyIterator.next();					// set에서 값을 하나 가져오기
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();

		// 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		// 키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
	}
}

//	출력 : 
//	총 Entry 수: 3
//	
//	홍길동: 95
//	
//	홍길동 : 95
//	신용권 : 85
//	동장군 : 80
//	
//	홍길동 : 95
//	신용권 : 85
//	동장군 : 80
//	
//	총 Entry 수: 2
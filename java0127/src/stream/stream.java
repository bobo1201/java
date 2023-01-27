package stream;

import java.awt.List;
import java.util.Set;

public class stream {

}

//		// List 컬렉션 처리
//		List<String> list = ......;
//		for(int i=0; i<list.size(); i++) {
//			String item = list.get(i);
//			// item 처리
//		}
//		
//		// Set 컬렉션 처리
//		Set<String> set = ......;
//		Iterator<String> iterator = set.iterator();
//		while(iterator.hasNext()) {
//			String item = iterator.next();
//			// 요소 처리
//		}
//		
//		// STREAM 처리
//		Stream<String> stream = list.stream();
//		stream.forEach(item -> // item 처리);
//		
//		기존 JAVA에서 컬렉션 데이터를 처리할때 특정 조건에 따라 필터링을 하려면 복잡한 과정을 거쳐야 한다.
//		반면에 SQL 문법의 경우 사용자가 원하는 조건의 데이터 목록을 검색할 때 명시적이고 간단한 방법을 이용하는데 JAVA 8에서
//		새로 추가된 기능인 스트림은 JAVA의 컬렉션 데이터에 대해 SQL 질의문처럼 데이터를 처리 할 수 있는 기능을 가진다.
//		
//		기존 루프문 처리의 문제점
//		기존 JAVA에서 컬렉션 데이터를 처리할 때는 for, foreach 루프문을 사용하면서 컬렉션 내의 요소들을 하나씩 다룬다.
//		간단한 처리나 컬렉션의 크기가 작으면 큰 문제가 아니지만 복잡한 처리가 필요하거나 컬렉션의 크기가 커지면 루프문의 사용은 성능처하를 일으키게 된다.
//		
//		스트림
//		스트림은 컬렉션 데이터를 선언형으로 쉽게 처리할 수 있다. 복잡한 루프문을 사용하지 않아도 되며 루프문을 중첩해서 사용해야 되는 최악의 경우도
//		없어지게 된다. 또한 스트림은 병렬처리(Multi thread)를 별도의 멀티스레드 구현없이도 쉽게 구현이 가능하다
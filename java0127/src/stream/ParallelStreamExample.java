package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		// 기존 방식
		for(int i=0; i<list.size(); i++) {
			String item = list.get(i);
			System.out.println(item);
		}
		System.out.println();
		
		// 병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
	}
}

//	출력 : 
//	홍길동
//	신용권
//	감자바
//	람다식
//	박병렬
//	
//	감자바: main
//	람다식: main
//	홍길동: main
//	박병렬: ForkJoinPool.commonPool-worker-2
//	신용권: ForkJoinPool.commonPool-worker-1


package streamcollect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample2 {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("감자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
		// groupingBy로 정한 것이 map의 key가 되며, 값은 List<Student> 형태입니다.
		Map<String, List<Student>> map = totalList.stream()
				.collect(
						Collectors.groupingBy(s -> s.getSex())
						);
		
		List<Student> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		List<Student> femaleList = map.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}
}

//	출력 : 
//	홍길동
//	감자바
//	
//	김수영
//	오해영
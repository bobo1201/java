package streammapping;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		// Student를 score 스트림으로 변환
		// mapToInt로 하지 않아도 되지만 기본 형태가 String이기 때문에
		// 숫자 계산을 위해서는 숫자형으로 변경하는 것이 중요합니다.
		studentList.stream()
		.mapToInt(s -> s.getScore())
		.forEach(score -> System.out.println(score));
		System.out.println();

		studentList.stream()
		.map(n -> n.getName())
		.forEach(name -> System.out.println(name));
	}
}

//	출력 : 
//	85
//	92
//	87
//	
//	홍길동
//	홍길동
//	홍길동
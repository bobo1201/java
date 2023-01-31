package stream2;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("신용권", 10));
		studentList.add(new Student("유미선", 20));
		
		// 점수를 기준으로 오름차순 정렬
		studentList.stream()
		.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();

		// 점수를 기준으로 내림차순 정렬
		studentList.stream()
		.sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}
}


//출력 : 
//신용권: 10
//유미선: 20
//홍길동: 30
//
//홍길동: 30
//유미선: 20
//신용권: 10
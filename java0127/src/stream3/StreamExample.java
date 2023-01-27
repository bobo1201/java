package stream3;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		String[] strArray = {"홍길동", "신용권", "김미나"};
		System.out.println("String 배열 내용 출력");
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item + ","));
		System.out.println();
		System.out.println();
		
		int[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("Int 배열 내용 출력");
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item + ","));
	}
}
	
//	출력 : 
//	String 배열 내용 출력
//	홍길동,신용권,김미나,
//	
//	Int 배열 내용 출력
//	1,2,3,4,5,
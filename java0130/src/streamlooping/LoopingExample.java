package streamlooping;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		// 잘못 작성한 경우
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(n -> System.out.println(n));
		
		// peek(중간 처리) 뒤에 sum() 최종처리 - 정상처리
		int total = Arrays.stream(intArr)
				.filter(a -> a%2 == 0)
				.peek(n -> System.out.println(n))
				.sum();
		System.out.println("총합: " + total + "\n");
		
		// forEach(최종처리) - 정상처리
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.forEach(n -> System.out.println(n));
	}
}

//	출력 : 
//	2
//	4
//	총합: 6
//
//	2
//	4


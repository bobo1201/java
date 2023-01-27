package stream4;

import java.util.stream.IntStream;

public class StreamExample {

	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
		
		sum = 0;
		
		IntStream stream1 = IntStream.range(1, 100);
		stream1.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
	}
}

//	출력 : 
//	총합: 5050
//	총합: 4950

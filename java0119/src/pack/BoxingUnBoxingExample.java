package pack;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		// Unboxing
		int value = obj;
		System.out.println("value : " + value);
		
		// 연산 시 Unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
		
//		컬렉션이라는 자료 구조 형태에서 사용하기 위해서 포장을 합니다.
//		객체 형태로 되어 있어야함.
	}
}

//	출력 : 
//	value : 100
//	value : 100
//	result : 200
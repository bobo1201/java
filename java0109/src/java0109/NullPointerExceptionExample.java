package java0109;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		
		int[] intArray = null;
//		intArray[0] = 10;       // 배열 크기가 지정되어 있지 않기때문에 nullPointer Error가 나타나게 됩니다.
		
		String str = null;
//		System.out.println("총 문자 수 : " + str.length());
		// null 값이기 때문에 nullPointer Error가 나타나게 됩니다.
	}
}

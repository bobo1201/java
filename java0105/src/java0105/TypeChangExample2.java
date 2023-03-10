package java0105;

public class TypeChangExample2 {
	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue; //자동 타입 변환
		
		long longValue = 5000000000L;
		float floatValue = longValue;    // 5.0E9f
		double doubleValue = longValue;  // 5.0E9
		
		char charValue = 'A';
		int inValue = charValue; // 65
		
		byteValue = 65;              // 1byte byte형은 char형에 대입 불가 자동 형변환X
//		char charValue = byteValue;  // 에러
	}
}
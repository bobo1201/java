package java0105;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		 
		int result = v1 + v2;                       // int 대신 byte로 사용하면 안됨
		System.out.println("result : " + result);   // int = byte + byte

		long result2 = v1 + v2 - v4;                // long = byte + byte - long
		System.out.println("result2 : " + result2);
		
		double result3 = (double)v1 / v2;           // double = double / byte
		System.out.println("result3 : " + result3);
		
		int result4 = v1 % v2;                      // int = byte % byte
		System.out.println("result4 : " + result4);		
	}
}

// 풀이 :
// result : 14
// result2 : 4
// result3 : 2.5
// result4 : 2

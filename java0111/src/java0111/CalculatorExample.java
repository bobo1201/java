package java0111;

public class CalculatorExample {

	public static void main(String[] args) {
		
		double result1 = 10 * 10 * Calculator.pi;
		
		double result2 = Calculator.plus(10, 5);
		double result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);	
	}
}

//	출력 :
//	result1 : 314.159
//	result2 : 15.0
//	result3 : 5.0


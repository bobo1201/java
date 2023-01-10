package java0110_2;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		// 리턴 없는 메소드는 저장할 변수가 필요 없음
		myCalc.powerOn();
		
		// 리턴되는 값이있는 메소드는 리턴되는 값을 저장할 변수(리턴되는 타입과 동일한 타입)가 필요 없음
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		double result2 = myCalc.divide(10, 4);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
	}
}

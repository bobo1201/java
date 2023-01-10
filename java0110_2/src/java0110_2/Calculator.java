package java0110_2;

public class Calculator {
	
	// 리턴 값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	// 리턴 값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다.");		
	}
	
	// 호출 시 두 정수 값을 전달 받고,
	// 호출한 곳으로 결과 값을 int 형으로 리턴한느 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 호출 시 두 정수 값을 전달 받고,
	// 호출한 곳으로 결과 값을 double 형으로 리턴하는 메소드
	double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
}

package java0113;

public class Car {
	// Car 클래스에서  Tire Class 타입의 tire 참조 변수를 생성
	public Tire tire;
	
	public void run() {
		tire.roll();
	}
}
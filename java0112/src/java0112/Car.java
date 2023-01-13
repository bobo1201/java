package java0112;

class Car1 {
	// 필드 (속성, 객체 변수)
	boolean powerOn;    // false
	String color;       // null
	int wheel;          // 0
	int speed;          // 0
	boolean wiperOn;    // false
	
	// 메소드 (함수, 기능, function) 이름()
	void power() { powerOn = !powerOn; }
	void speedUp() { speed++; }
	void speedDown() { speed--; }
	void wiper() { wiperOn = !wiperOn; } 	
}

public class Car {
	public static void main(String[] args) {
		// 객체가 생성되지 않으면 클래스 사용이 불가능하다.
		// System.out.println("시동 처음 초기화 : " + Car.powerOn);
		
		// Car 클래스를 이용해서 mycar라는 객체 생성 : Car 클래스안에 필드와 메소드 이용 가능
		Car1 mycar = new Car1();
		
		System.out.println("시동 처음 초기화 : " + mycar.powerOn);
		System.out.println("차의 색상 초기화 : " + mycar.color);
		System.out.println("바퀴의 수 초기화 : " + mycar.wheel);
		System.out.println("속력 초기화 : " + mycar.speed);
		System.out.println("와이퍼 작동 초기화 : " + mycar.wiperOn);
		
		mycar.power();
		System.out.println("시동 메소드 동작 : " + mycar.powerOn);
		mycar.power();
		System.out.println("시동 메소드 다시 동작 : " + mycar.powerOn);
		
		mycar.color = "black";
		System.out.println("현재 차의 색상 : " + mycar.color);
	}
}

//	출력 : 
//	시동 처음 초기화 : false
//	차의 색상 초기화 : null
//	바퀴의 수 초기화 : 0
//	속력 초기화 : 0
//	와이퍼 작동 초기화 : false
//	시동 메소드 동작 : true
//	시동 메소드 다시 동작 : false
//	현재 차의 색상 : black
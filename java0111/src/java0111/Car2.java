package java0111;

public class Car2 {
	// 인스턴스 필드
	int speed;

	// 인스턴스 메소드
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	// 정적 메소드
	static void simulate() {
		Car2 myCar = new Car2();
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();  // 정적 메소드 호출
		
		Car2 myCar = new Car2();
		myCar.speed = 60;
		myCar.run();		
	}
}

//	출력 : 
//	200으로 달립니다.
//	60으로 달립니다.
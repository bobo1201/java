package java0113;

public class DriverExample {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		// 매개 값으로 Bus 객체를 제공하고 driver() 메소드 호출
		Bus bus = new Bus();
		// driver.drive(new Bus());와 동일합니다.
		driver.drive(bus);

		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}
}

//	출력 : 
//	버스가 달립니다.
//	택시가 달립니다.
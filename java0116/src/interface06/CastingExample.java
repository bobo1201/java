package interface06;

public class CastingExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
}

//	출력 : 
//	버스가 달립니다.
//	버스가 달립니다.
//	승차요금을 체크합니다.
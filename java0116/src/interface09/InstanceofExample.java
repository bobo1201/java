package interface09;

public class InstanceofExample {
	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	public static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		
		/* 
		 * Java12부터 사용가능합니다.
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		*/
		vehicle.run();
	}
}

//	출력 : 
//	택시가 달립니다.
//
//	승차요금을 체크합니다.
//	버스가 달립니다.

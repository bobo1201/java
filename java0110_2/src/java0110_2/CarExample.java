package java0110_2;

public class CarExample {
	public static void main(String[] args) {
		// Car 클래스를 이용하여 myCar 객체 생성
		Car car1 = new Car("자가용");
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("자가용", "빨강");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		System.out.println();

		Car car3 = new Car("택시", "빨강", 200);
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println();
	}
}

//	출력 : 
//	car1.company : 현대자동차
//	car1.model : 자가용
//	car1.color : 은색
//	car1.maxSpeed : 250
//
//	car2.company : 현대자동차
//	car2.model : 자가용
//	car2.color : 빨강
//	car2.maxSpeed : 250
//
//	car3.company : 현대자동차
//	car3.model : 택시
//	car3.color : 빨강
//	car3.maxSpeed : 200

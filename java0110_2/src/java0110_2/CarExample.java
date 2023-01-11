package java0110_2;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			myCar.run();
		}
		
		System.out.println("gas를 주입하세요.");
	}
}


//	출력 : 
//	gas가 있습니다.
//	출발합니다.
//	달립니다.(gas잔량:5)
//	달립니다.(gas잔량:4)
//	달립니다.(gas잔량:3)
//	달립니다.(gas잔량:2)
//	달립니다.(gas잔량:1)
//	멉춥니다.(gas잔량:0)
//	gas를 주입하세요.
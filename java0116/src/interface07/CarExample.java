package interface07;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();

		myCar.run();
	}
}

//	출력 : 
//	한국 타이어가 굴러갑니다.
//	한국 타이어가 굴러갑니다.
//	금호 타이어가 굴러갑니다.
//	금호 타이어가 굴러갑니다.
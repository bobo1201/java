package anonymous;

public class Car {
	
	// 필드에 Tire 객체 대입
	private Tire tire1 = new Tire();
	
	// 필드에 익명 자식 객체 대입
	private Tire tire2 =new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}; // 세미콜론을 넣어도 되고 안넣어도 됩니다.
		// 보통 세미콜론을 사용하지 않는 경우가 많습니다.
	};
	// 익명 객체는 마지막에 세미콜론(;)을 붙여줘야합니다.
	
	// tire1과 tire2(익명 자식 객체) 객체 안의 roll() 메서드 실행
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		// 로컬 변수에 익명 자식 객체 대입
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	// 메소드(매개변수 이용)
	public void run3(Tire tire) {
		tire.roll();
	}
}

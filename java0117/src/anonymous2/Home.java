package anonymous2;

public class Home {
	// 필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	// 메소드(필드 이용)
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	// use1은 메모리에 계속 남을 수가 있습니다.
	// 차라리 use2를 사용하면 사용시 객체 생성되었다가 rc가 사라집니다.
	// 메모리 입장에서는 use1 보다는 use2의 방법이 훨씬 낫습니다.
	
	// 메소드(로컬 변수 이용)
	public void use2() {
		// 로컬 변수에 익명 구현 객체 대입
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}

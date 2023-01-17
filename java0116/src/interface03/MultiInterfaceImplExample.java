package interface03;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		// RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		// Searchable 인터페이스 변수 선언 및 구현 객체 대입
		Searchable searchable = new SmartTelevision();
		
		searchable.search("https://www.youtube.com");
	}
}

//	출력 : 
//	TV를 켭니다.
//	TV를 끕니다.
//	https://www.youtube.com을 검색합니다.

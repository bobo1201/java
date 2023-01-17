package java0117;

public class AExample {
	public static void main(String[] args) {
		// A 객체 생성
		A a = new A();
		
		// A 메소드 호출
		a.useB();
		
	}
}

//	출력 : 
//	B-field
//	B-method
//	A-field
//	A-method
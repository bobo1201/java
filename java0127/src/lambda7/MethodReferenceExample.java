package lambda7;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(String :: compareToIgnoreCase);
	}
}

//	출력 :
//	홍길동은 김길동보다 뒤에 옵니다.

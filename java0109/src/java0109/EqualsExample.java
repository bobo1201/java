package java0109;

public class EqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {  // == 번지 값을 비교
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");			
		}
		
		if(strVar1.equals(strVar2)) {   // equals 데이터 값을 비교
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		// 객체로 생성, 새로운 주소 값과 데이터가 따로 저장됩니다.
		// 리터럴 값("홍길동")이 같지만 주소가 각각 따로 저장됩니다.
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else { 
			System.out.println("strVar3과 strVar4는 참조가 다름");			
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}

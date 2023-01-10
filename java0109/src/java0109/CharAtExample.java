package java0109;

public class CharAtExample {

	public static void main(String[] args) {
//		주민등록번호의 값을 이용하여 성별 확인
//		생년월일성별 222(성별) 1 2 3 4
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch(sex) {
			case '1' :
			case '3' :
				System.out.println("남자입니다.");
				break;
			case '2' :
			case '4' :
				System.out.println("여자입니다.");
		}
		
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");			
		}
	}
}

//남자입니다.
//주민등록번호 자릿수가 맞습니다.

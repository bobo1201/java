package java0105;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';    // 문자리터럴 대입
		char c2 = 65;     // 유니코드 대입  //영문자의 경우(ASCII)코드 입력
		
		char c3 = '가';    // 문자리터럴 대입
		char c4 = 44032;   // 유니코드 대입
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}

// 무조건 양수이기 때문에 -가 붙으면 안됩니다.
// 큰 따옴표를 사용해도 안되고 문자열도 작성하면 안됩니다.
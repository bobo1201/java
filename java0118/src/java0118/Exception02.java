package java0118;

public class Exception02 {
	public static void main(String[] args) {		
		int a = 0;
		int b = 2;
		
		try {
			System.out.println("외부로 접속");
			int c = b/a;
			System.out.println("연결 해제");
		} catch(ArithmeticException e) {
			System.out.println("오류 발생하였습니다.");
		} finally {
			System.out.println("무조건 연결 해제");			
		}
	}
}

//	출력 : 
//	외부로 접속
//	오류 발생하였습니다.
//	무조건 연결 해제
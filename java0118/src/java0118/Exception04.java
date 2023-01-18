package java0118;

public class Exception04 {
	
	public static void methodA() throws Exception{
		methodB();
	}
	
	public static void methodB() throws Exception{
		methodC();
	}
	
	public static void methodC() throws Exception{
		Exception e = new Exception();
		throw e;
	}
	
	public static void main(String[] args) {			
		try {
			methodA();
		} catch(Exception e) {
			System.out.println("메인에서 처리");
		}
	}
}

//	출력 : 
//	메인에서 처리


// throw : 고의적으로 예외 발생
// throws : 예외 던지기 호출한 쪽으로 예외를 넘긴다.
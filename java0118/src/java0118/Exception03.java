package java0118;

public class Exception03 {
	public static void main(String[] args) {		
		
		try {
			Exception e = new Exception("고의 예외");
			throw e;
		} catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}
	}
}

//	출력 : 
//	예외 발생
//	고의 예외


// throw : 고의적으로 예외 발생
// throws : 예외 던지기 호출한 쪽으로 예외를 넘긴다.
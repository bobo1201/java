package java0118;

public class RethorwExample {
	/** Main method **/
	
	public static void main(String[] args) {
		// Try some code
		try {
			System.out.println("외부 try...");
			
			try {
				System.out.println("내부 try...");
				Exception e = new Exception();
				throw e;
			} catch(Exception e) {
				System.out.println("(내부 try-catch) exception : " + e);
				System.out.println("예외 던지기 한번 더 : ");
				throw e;
			} finally {
				System.out.println("finally 구문출력");
			}
		} catch(Exception e) {
			System.out.println("(외부 try-catch)Catch exception : " + e);
		}
		System.out.println("종료");
	}
}

//	출력 : 
//	외부 try...
//	내부 try...
//	(내부 try-catch) exception : java.lang.Exception
//	예외 던지기 한번 더 : 
//	finally 구문출력
//	(외부 try-catch)Catch exception : java.lang.Exception
//	종료

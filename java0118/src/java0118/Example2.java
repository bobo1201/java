package java0118;

public class Example2 {
	
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);			
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());  // ①
//			System.out.println(e.toString());    // ②
//			e.printStackTrace();                 // ③
		} finally {
			System.out.println("[마무리 실행]\n");
		}
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");	
	}
}


//	출력 :
//	[프로그램 시작]
//	
//	문자 수 : 10
//	[마무리 실행]
//	
//	null      -------------------------------------------------- ① 출력
//	java.lang.NullPointerException   --------------------------- ②, ③ 출력
//		at java0118.Example2.printLength(Example2.java:7)   ---- ③ 출력
//		at java0118.Example2.main(Example2.java:21)         ---- ③ 출력
//	[마무리 실행]
//	
//	[프로그램 종료]

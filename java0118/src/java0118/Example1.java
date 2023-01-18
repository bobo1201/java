package java0118;

public class Example1 {
	
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수 : " + result);
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
//	Exception in thread "main" java.lang.NullPointerException
//		at java0118.Example1.printLength(Example1.java:6)
//		at java0118.Example1.main(Example1.java:13)
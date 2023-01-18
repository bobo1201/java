package throws01;

public class ThrowsExample1 {

	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리 : " + e.toString());
		}
		System.out.println("프로그램 종료");
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}

//	출력 : 
//	예외 처리 : java.lang.ClassNotFoundException: java.lang.String2
//	프로그램 종료

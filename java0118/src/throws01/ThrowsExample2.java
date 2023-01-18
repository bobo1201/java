package throws01;

public class ThrowsExample2 {

	public static void main(String[] args) throws Exception {
		findClass();
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}

//	출력 : 
//	Exception in thread "main" java.lang.ClassNotFoundException: java.lang.String2
//	at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
//  .
//  .
//  .
//	at throws01.ThrowsExample2.findClass(ThrowsExample2.java:10)
//	at throws01.ThrowsExample2.main(ThrowsExample2.java:6)
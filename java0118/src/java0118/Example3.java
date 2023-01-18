package java0118;

public class Example3 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}

//	출력 :
//	java.lang.String 클래스가 존재합니다.
//	
//	java.lang.ClassNotFoundException: java.lang.String2
//		at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
//		at java.lang.ClassLoader.loadClass(ClassLoader.java:418)
//		at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:355)
//		at java.lang.ClassLoader.loadClass(ClassLoader.java:351)
//		at java.lang.Class.forName0(Native Method)
//		at java.lang.Class.forName(Class.java:264)
//		at java0118.Example3.main(Example3.java:15)

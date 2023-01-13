package java0112;

public class ch06_ex16 {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}

class Printer {
	void println(int value) {
		System.out.println(value);
	}
	void println(double value) {
		System.out.println(value);
	}
	void println(boolean value) {
		System.out.println(value);
	}
	void println(String value) {	
		System.out.println(value);
	}	
}

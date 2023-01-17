package app;

import pack1.A;
import pack2.B;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		B b = new B();
		b.method();
	}
}

//	출력 : 
//	A-method 실행
//	B-method 실행
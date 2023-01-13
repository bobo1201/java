package package2;

import package1.A;

public class D extends A {

	public D() {
		super();
	}
	
	// 상속을 통해서 사용 가능합니다.
	public void method1() {
		this.field = "value";
		this.method();
	}
	
	// 직접 객체를 생성해서 사용하는 것은 안됩니다.
	public void method2() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}

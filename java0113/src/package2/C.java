package package2;

import package1.A;

public class C {
	public void method() {
		A a = new A();       // a에 protected : 다른 패키지라서 접근 불가능
		a.field = "value";
		a.method();
	}
}

package interface04;

public class ExtendsExample {
	public static void main(String[] args) {
		
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB();
		System.out.println();
		
		InterfaceB ib = impl;
//		ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ia.methodA();
		ib.methodB();
		ic.methodC();
		
//		실제 사용할 때는 아래와 같이 사용합니다.
//		impl.methodA
//		impl.methodB
//		impl.methodC
	}
}


//	출력 :
//	InterfaceCImpl-methodA() 실행
//	
//	InterfaceCImpl-methodB() 실행
//	
//	InterfaceCImpl-methodA() 실행
//	InterfaceCImpl-methodB() 실행
//	InterfaceCImpl-methodC() 실행
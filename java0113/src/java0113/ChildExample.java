package java0113;

public class ChildExample {
	
	public static void main(String[] args) {
		
		// 부모 값만 사용할 수 있는 Child 주소 생성 
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		부모 타입으로 변환 : field2와 method3가 없기 때문에 에러가 나타납니다.
//		parent.field2 = "data2";
//		parent.method3();		
				
		// 강제 타입 변환 
		// 부모 타입에 field2와 method3를 붙여서 타입 변환합니다.
		// Child child = new Child();와 동일합니다.
		Child child = (Child) parent;
		
		child.field2 = "data2";
		child.method3();
		child.field1 = "data1";
		child.method1();
		child.method2();
	}
}

//	출력 : 
//	Parent-method1()
//	Parent-method2()
//	Child-method3()
//	Parent-method1()
//	Parent-method2()
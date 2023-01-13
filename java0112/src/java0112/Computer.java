package java0112;

public class Computer extends Calculator{

	//메소드 오버라이딩
	// 컴파일시 정확히 오버라이딩이 되었는지 체크해줍니다.(생략가능)
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	
//	소스를 이용해서 부모 클래스에서 아래의 코드를 가져올 수 있습니다.
//	@Override
//	public double areaCircle(double r) {
//		// TODO Auto-generated method stub
//		return super.areaCircle(r);
//	}
}
package java0110_2;

public class KoreanExample {
	
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		
		System.out.println("k1.nation : " + k1.nation);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "930525-0654321");
		System.out.println("k2.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}	
}

// 출력 :
// k1.nation : 대한민국
// k1.name : 박자바
// k1.ssn : 011225-1234567
// k2.nation : 대한민국
// k2.name : 김자바
// k2.ssn : 930525-0654321

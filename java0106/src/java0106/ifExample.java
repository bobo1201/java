package java0106;

public class ifExample {
	public static void main(String[] args) {
		
//		Math.random() : 랜덤한 수를 출력
//		0.0 <= Math.random() < 1.0
		
//		0.0 * 6 <= Math.random() * 6 < 1.0 * 6
//		0.0 <= Math.random() * 6 < 6.0 
//		정수형으로 변경하면 : 0,1,2,3,4,5
//		(int)0.0 <= (int)(Math.random() * 6) < (int)6.0
		
//		1~6까지 출력하려면 
//		(int)1.0 <= ((int)(Math.random() * 6) + 1) < (int)7.0
		
		int num = (int)(Math.random() * 45) + 1;
		
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 100-90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score >= 80) {
			System.out.println("점수가 89-80입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 79-70입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70미만 입니다.");
			System.out.println("등급은 D입니다.");			
		}
	}
}

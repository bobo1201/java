package java0112;

public class Driver {

	public static void main(String[] args) {
		// 학부생 객체
		Undergraduate understu1 = new Undergraduate();
		
		understu1.setName("선남");
		understu1.setNumber(1601);
		understu1.setClubName("로봇");
		
		System.out.println(understu1.toString());
		
		Undergraduate understu2 = new Undergraduate("선녀", 1602, "독서");
		
		System.out.println(understu2.toString());
		
		if(understu1.equals(understu2)) {
			System.out.println("두 객체가 서로 같다.");
		} else {
			System.out.println("두 객체가 서로 다르다.");
		}
	}
}

//	출력 : 
//	이름 : 선남, 학번 : 1601, 동아리 이름 : 로봇
//	이름 : 선녀, 학번 : 1602, 동아리 이름 : 독서
//	두 객체가 서로 다르다.
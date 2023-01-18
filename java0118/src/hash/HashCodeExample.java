package hash;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if(s1 == s2) {
			if(s1.equals(s2)) {
				System.out.println("동등 객체입니다.");
			} else {
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
		} else {
			System.out.println("주소가 다르므로 동등 객체가 아닙니다.");
		}
	}
}

//	출력 :
//	hash.Student@33a43af
//	hash.Student@33a43af
//	54150063
//	54150063
//	동등 객체입니다.
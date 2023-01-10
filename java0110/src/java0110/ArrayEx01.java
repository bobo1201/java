 package java0110;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		String[] languages = new String[3];
		languages[0] = "Java";
		languages[1] = "Java";
		languages[2] = new String("Java");
		
		System.out.println(languages[0] == languages[1]);
		System.out.println(languages[0] == languages[2]);
		System.out.println(languages[0].equals(languages[2]));
	}
}

// 출력 : 
// true : 같은 객체를 참조
// false : 다른 객체를 참조
// true : 문자열이 동일
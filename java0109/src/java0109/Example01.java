package java0109;

public class Example01 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍은 어렵다!";
		
		System.out.println(str.length());
		System.out.println(str.indexOf("어렵다"));
		str = str.replace("어렵다", "쉽다");
		System.out.println(str);
	}
}

// 14
// 10
// 자바 프로그래밍은 쉽다!
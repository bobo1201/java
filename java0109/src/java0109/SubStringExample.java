package java0109;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); // endindex 앞에서 잘라냅니다.
		String endNum = ssn.substring(7); // 시작위치부터 끝까지 출력합니다.
		
		System.out.println(firstNum);
		System.out.println(endNum);
	}
}


// 880815
// 1234567
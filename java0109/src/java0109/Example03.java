package java0109;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		if(str.contains("가을")) {
			str = str.replace("가을", "봄");
		}
		
		System.out.println(str);
		
		sc.close();
	}
}

// 출력 : 
// 나는 가을을 좋아합니다.
// 나는 봄을 좋아합니다.
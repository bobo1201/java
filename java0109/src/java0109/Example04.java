package java0109;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일 이름을 입력하세요 : ");
		String str = sc.nextLine();
		
		String[] arrStr = str.split(" ");
		
		for(int i=0; i<arrStr.length; i++) {
			System.out.print(arrStr[arrStr.length - i - 1] + " ");
		}
		
		sc.close();
	}
}

// 출력 : 
// 과일 이름을 입력하세요 : 사과 포도 감 바나나
// 바나나 감 포도 사과 
package java0109;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "홍길동/180257/컴퓨터공학과";
		
		String arrStr[] = str.split("/");
		
		System.out.println("이름, 학번과 학과를 입력하세요: " + str);		
		System.out.println("이름 : " + arrStr[0]);
		System.out.println("학번 : " + arrStr[1]);
		System.out.println("학과 : " + arrStr[2]);
		System.out.println();
		
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("생년월일(mm/dd/yy)을 입력하세요: ");
		String birth = sc.next();
		
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birth.substring(6) + "년 " + birth.substring(0,2) + "월 "
				+ birth.substring(3,5) + "일");
	}
}

// 출력 : 
// 이름, 학번과 학과를 입력하세요: 홍길동/180257/컴퓨터공학과
// 이름 : 홍길동
// 학번 : 180257
// 학과 : 컴퓨터공학과
//
// 이름을 입력하세요: 홍길동
// 생년월일(mm/dd/yy)을 입력하세요: 10/05/16
// 이름 : 홍길동
// 생년월일 : 16년 10월 05일

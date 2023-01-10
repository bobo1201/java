package java1214;

import java.util.Scanner;

public class ex05_12 {
	public static void main(String[] args) {
		String[] words = {"chair", "computer", "integer"};
		
		Scanner scan = new Scanner(System.in);
		
		int cnt =0;
		
//		String str = "hi";
//		String str2 = new String("hi");
		
		for(int i=0; i<words.length; i++) {
			
			
			String str[] = {"의자", "컴퓨터", "정수"};
			
			System.out.print(words[i] + "의 뜻은?");
			String str1 = scan.next();
			
			if(str[i].equals(str1)) {
				System.out.println("정답입니다.");	
				cnt++;
			} else {
				System.out.print("틀렸습니다. 정답은 " + str[i] + "입니다");	
			}
			System.out.println();

		}
		System.out.println("전체 " + words.length + "문제 중 " + cnt + "문제 맞추셨습니다.");
		
	}
}

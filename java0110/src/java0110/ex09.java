package java0110;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[] {};
		
		while(true) {
			
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 "
					+ "| 5. 종료");
			System.out.println("-------------------------------------------------");
			
			System.out.print("선택> ");
			String ch = sc.next();
			
			if(ch.equals("5")) break;			
			
			switch(ch) {
				case "1":
					System.out.print("학생수> ");
					int a = sc.nextInt();
					scores = new int[a];
					break;
				case "2":
					for(int i=0; i<scores.length; i++) {
						System.out.print("scores[" + i + "]: ");				
						scores[i] = sc.nextInt();
					}
					break;
				case "3":
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores[" + i + "]: " + scores[i]);				
					}
					break;
				case "4":
					int sum = 0;
					int max = 0;

					for(int i=0; i<scores.length; i++) {
						if(scores[i] > max) {
							max = scores[i];
						}
						sum += scores[i];
					}
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + (double)sum/scores.length);
					break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
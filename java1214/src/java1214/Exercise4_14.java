package java1214;

import java.util.Random;
import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int answer = random.nextInt(100) + 1; 
		int input = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = scan.nextInt();
			if(answer == input) {
				break;
			}
		} while(true);
		
	}

}
//했던거

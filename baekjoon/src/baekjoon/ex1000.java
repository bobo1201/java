package baekjoon;

import java.util.Scanner;

public class ex1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		do {
			a = sc.nextInt();
			b = sc.nextInt();						
		}while(a < 0 || a > 10 || b < 0 || b> 10);
		
		
		System.out.println( a + b );
	}
}

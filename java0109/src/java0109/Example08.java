package java0109;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int n = sc.nextInt();
		
		char a = 'a' - 1;
		char arr[][] = new char[n][];
		
		
		for(int i=0; i<n; i++) {
			System.out.print(i + "열의 크기 : ");
			int m = sc.nextInt();
			arr[i] = new char[m];
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (char)(a + 1);
				a = arr[i][j];
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
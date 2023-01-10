package java0109;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] arr = new String[6][6];
		
		System.out.print("행 인덱스 입력 : ");
		int n = sc.nextInt();
		
		System.out.print("열 인덱스 입력 : ");		
		int m = sc.nextInt();
		
		String a = "0";

		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j < arr[i].length; j++) {
				if(i == 0 && j > 0) {
					arr[i][j] = a;
					arr[j][i] = a;
					
					int b = Integer.parseInt(a) + 1;
					a = Integer.toString(b);
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {			
			for(int j=0; j < arr[i].length; j++) {
				if(i == 0 && j > 0) {
					System.out.print("\t" + arr[i][j]);
				} else if(i > 0) {
					System.out.print("\t");
				}
				if(i == n && j == m) {
					arr[n][m] = "x";
					System.out.print(arr[n][m]);
				}
			}
			if(i > 0) {
				System.out.print("\n" + arr[i][0]);
			}

		}
			
	}
}
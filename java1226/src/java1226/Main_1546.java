package java1226;

import java.util.Scanner;

public class Main_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		double max = 0;
		double sum = 0;
		double avg = 0;
		
		do {
			n = sc.nextInt();
		}while(n > 1000);
		
		double arr[] = new double[n];
		
		for(int i=0; i < arr.length; i++) {
			
			do {
				arr[i] = sc.nextInt();
			} while(arr[i] > 100 || arr[i] < 0);
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = arr[i] * 100 / max;
			sum+= arr[i];
		}
		avg = (double)sum / arr.length;
		
		System.out.println(avg);
	}
}

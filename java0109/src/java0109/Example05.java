package java0109;


public class Example05 {
	public static void main(String[] args) {
		
		String str[][] = new String[3][3];
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				str[i][j] = "(" + i + "," + j + ")";
				System.out.print(str[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		int[][] arr = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = arr[i].length*i+j+1; 
				// arr[i]의 길이 4에 i값을 곱하고 j 값을 더하면 0부터 증가합니다.
				// 따라서 1을 추가로 더해줍니다.
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		int[][] arr1 = new int[4][4];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = arr1[i].length*(arr1.length-i)-j;
				System.out.print(arr1[i][j] + " ");
				// arr1[i]의 길이 4에 (arr1의 길이-1) 값을 곱하고 j 값을 빼면 16부터 감소합니다.
			}
			System.out.println();
		}
	}
}
package java0109;

public class Example07 {
	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		
		final int RowFinal = arr.length - 1;
		final int ColFinal = arr[0].length - 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i !=  RowFinal && j !=  ColFinal) {
					arr[i][j] = (int)(Math.random()*10 + 1);

					arr[i][ColFinal] += arr[i][j];
					arr[RowFinal][i] += arr[j][i];
					arr[RowFinal][ColFinal] += arr[i][j];
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
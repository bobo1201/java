package java0110;

public class ex07 {
	public static void main(String[] args) {
		
		int[] array = { 1, 5, 3, 8, 2 };
		int max = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("최댓값 : " + max);

	}
}
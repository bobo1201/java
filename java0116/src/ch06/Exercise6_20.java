package ch06;

public class Exercise6_20 {
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
	
	public static int[] shuffle(int[] arr) {

		int temp;

		for(int i=0; i<arr.length; i++) {
			int rand = (int)(Math.random()*9) + 1;
			temp = arr[i];
			arr[i] = arr[rand-1];
			arr[rand-1] = temp;
		}
		return arr;
	}
}




 package java0110;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		
//		for(int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		}
		
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("점수 총합 = " + sum);
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}

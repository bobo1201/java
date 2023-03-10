package java0109;

public class MultiArrayExample4 {

	public static void main(String[] args) {
		
		int[][] scores = {    // 2차원 배열 scores [2]행[3]열 = 6 데이터를 입력
				{80, 90, 96},
				{76, 88}
		};
		
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);
		
		// 첫 번째 반의 세 번째 학생의 점수 읽기		
		System.out.println("scores[0][2]: " + scores[0][2]);
		
		// 두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		// 첫 번째 반의 평균 점수 구하기
		int class1Sum = 0;
		for(int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 점수 합계: " + class1Sum);
		System.out.println("첫 번째 반의 평균 점수: " + class1Avg);

		// 두 번째 반의 평균 점수 구하기
		int class2Sum = 0;
		for(int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두 번째 반의 점수 합계: " + class2Sum);
		System.out.println("두 번째 반의 평균 점수: " + class2Avg);
		
		// 전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for(int k=0; k < scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		double totalAvg = (double) totalSum/totalStudent;
		System.out.println("전체 학생의 평균 점수: " + totalAvg);
	}
}

// 출력 : 
// 1차원 배열 길이(반의 수): 2
// 2차원 배열 길이(첫 번째 반의 학생 수): 3
// 2차원 배열 길이(두 번째 반의 학생 수): 2
// scores[0][2]: 96
// scores[1][1]: 88
// 첫 번째 반의 점수 합계: 266
// 첫 번째 반의 평균 점수: 88.66666666666667
// 두 번째 반의 점수 합계: 164
// 두 번째 반의 평균 점수: 82.0
// 전체 학생의 평균 점수: 86.0

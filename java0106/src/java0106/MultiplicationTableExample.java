package java0106;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		
		// 총 실행 횟수 8 * 9 = 72번 실행
		for(int m=2; m<=9; m++) {       // 2 3 4 5 6 7 8 9 : 8번
			System.out.println("*** " + m + "단 ***");
			for(int n=1; n<=9; n++) {   // 1 ~ 9 : 9번
				System.out.println(m + " x " + n + " = " + (m*n));
			}
			System.out.println();
		}
	}
}

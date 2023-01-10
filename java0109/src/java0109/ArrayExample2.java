package java0109;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		int[] scores;                      // 변수 선언시 null로 지정해도 됩니다.
		scores = new int[] { 83, 90, 87 };
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		//배열을 매개값으로 주고, 메소드를 호출할 수 있습니다.
		printItem(new int[] {83, 90, 97});
	}
	
	public static void printItem( int[] scores ) {
		for(int i=0; i<3; i++) {
			System.out.println("scores[" + i + "]: " + scores[i]);
		}
	}
}

// 출력 : 
// 총합 : 260
// scores[0]: 83
// scores[1]: 90
// scores[2]: 97

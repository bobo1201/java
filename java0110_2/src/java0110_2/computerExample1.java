package java0110_2;

public class computerExample1 {
	public static void main(String[] args) {

		computer1 com = new computer1();
		
		int sum1 = com.sum(85, 95, 93);
		double avg1 = com.avg(85, 95, 93);
		
		System.out.println("sum1 : " + sum1);
		System.out.println("avg1 : " + avg1);
		
		int sum2 = com.sum(85, 95, 93, 84);
		double avg2 = com.avg(85, 95, 93, 94);
		
		System.out.println("sum2 : " + sum2);
		System.out.println("avg2 : " + avg2);
		
		int sum3 = com.sum(85, 95, 93, 84, 75);
		double avg3 = com.avg(85, 95, 93, 94, 75);
		
		System.out.println("sum3 : " + sum3);
		System.out.println("avg3 : " + avg3);
		
		System.out.println();
		
		com.sumAvg(5, 6, 7);
		com.sumAvg(5, 6, 7, 8);
		com.sumAvg(5, 6, 7, 8, 9);
	}
}

// 출력 : 
// sum1 : 273
// avg1 : 91.0
// sum2 : 357
// avg2 : 91.75
// sum3 : 432
// avg3 : 88.4
//
// sum : 18
// avg : 6.0
// sum : 26
// avg : 6.5
// sum : 35
// avg : 7.0
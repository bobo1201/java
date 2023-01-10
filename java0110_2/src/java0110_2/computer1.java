package java0110_2;

public class computer1 {
	
	int sum(int ... values) {
		
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
	
	double avg(int ... values) {
		
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return (double)sum/values.length;
	}
	
	
	void sumAvg(int ... values) {
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (double)sum/values.length);
	}
	
}

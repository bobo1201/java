package java0125;

import java.awt.Toolkit;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch(InterruptedException e) {
		}
		
		System.out.println("1~100 합 : " + sumThread.getSum());
	}
}

//	출력 : 
//	1~100 합 : 5050

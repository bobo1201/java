package java1214;

public class ex05_06 {
	public static void main(String[] args) {

		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		int count = 0;
		System.out.println("money = " + money);
		
		for(int i=0; i<coinUnit.length; i++) {
			
			count = money / coinUnit[i];
			
			System.out.println(coinUnit[i] + "원 : " + count + " ");
			
			money %= coinUnit[i];
		}
	}
}

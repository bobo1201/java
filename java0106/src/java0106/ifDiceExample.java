package java0106;

public class ifDiceExample {
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 6) + 1;
		int num2 = (int)(Math.random() * 6) + 1;
		
		System.out.println("첫 번째 주사위 숫자 : " + num);
		System.out.println("두 번째 주사위 숫자 : " + num2);
		
		int sum = num + num2;
				
		if(num == num2) {
			System.out.println("더블입니다. " + sum + "칸 이동하세요. 한번 더 던지세요.");
		} else {
			System.out.println(sum + "칸 이동하세요.");
		}
	}
}

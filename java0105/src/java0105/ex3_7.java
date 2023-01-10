package java0105;

public class ex3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (fahrenheit - 32) *5 /9f;
		
		System.out.printf("Celcius : %2.2f", celcius);
		System.out.println();
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}
}
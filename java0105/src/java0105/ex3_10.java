package java0105;

public class ex3_10 {
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (ch >= 65 && ch <= 90) ? (char)(ch + 32) : ' ' ;
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}
}
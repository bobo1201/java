package java0105;

public class ex3_8 {
	public static void main(String[] args) {
		byte a = 10;  
		byte b = 20;  
		byte c = (byte)(a + b);        // (byte)
		
		
		char ch = 'A';
		ch = (char)(ch + 2);           // (char)
		
		float f = 3 / 2f;              // f
		long l = 3000 * 3000 * 3000L;  // L
		
		float f2 = 0.1f;
		double d = (float)0.1;         // (float)
		
		boolean result = d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
	}
}
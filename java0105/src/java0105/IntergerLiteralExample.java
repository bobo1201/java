package java0105;

public class IntergerLiteralExample {

	public static void main(String[] args) {
		int var1 = 0b1011; //0b   2진수     1011  =  11  (1*8 + 1*2 + 1*1)
		int var2 = 0206;   //0    8진수     206   =  134 (010 000 110)
		int var3 = 365;    //     10진수   365   =  365
		int var4 = 0xB3;   //0x   16진수   B3    =  179 (1011 0011)  
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}
}

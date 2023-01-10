package java1214;

public class ex05_10 {
	public static void main(String[] args) {
		
		char[] abcCode =
			{ '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
					'(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
					'}', ';', ':', ',', '.', '/'};
		
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		String src = "abc123";
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
						
			if(src.charAt(i) >= 'a' && src.charAt(i) <= 'z') {
				result += abcCode[src.charAt(i) - 97];
			} else if(src.charAt(i) >= '0' && src.charAt(i) <= '9'){
				result += numCode[src.charAt(i) - 48];
			}
		}
		
		System.out.println("src : " + src);
		System.out.println("result : " + result);	
		
	}
}

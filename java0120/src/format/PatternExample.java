package format;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
	
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");			
		}
		
		// 역슬래시(\) 한 번만 넣으면 문자열로 인식하기 때문에 두 번 사용합니다.
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@mycompany.com";
		// data = "angel@mycompany.co.kr";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");			
		}
	}
}

//	출력 : 
//	정규식과 일치합니다.
//	정규식과 일치합니다.
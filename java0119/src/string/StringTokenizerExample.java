package string;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";  // 구분자가 여러 종류일 경우
		String[] arr = data1.split("&|,"); // split을 이용해 배열에 문자를 저장합니다.
		for(String token : arr) {          
			System.out.println(token);     // 문자열을 하나씩 가져옴
		}
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수";  // 구분자가 하나의 종류일 경우
		StringTokenizer st = new StringTokenizer(data2, "/");
		while(st.hasMoreTokens()) {        // 남아 있는 문자열이 있는지 확인
			String token = st.nextToken(); // 문자열을 하나씩 가져옴
			System.out.println(token);
		}
	}
}

//	출력 : 
//	홍길동
//	이수홍
//	박연수
//	
//	홍길동
//	이수홍
//	박연수

package format;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		// 정수 자리까지 표기(반올림), 천 단위마다 , 표시
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		// 소수 첫째 자리까지 표기(반올림), 천 단위마다 , 표시
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("000,000,000.000");
		System.out.println(df.format(num));
		
	}
}

//	출력 : 
//	1,234,568
//	1,234,567.9
//	001,234,567.890
package format;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
				
		LocalDateTime endDateTime = LocalDateTime.of(2023,3,31,0,0,0);
		System.out.println("종료일 : " + endDateTime.format(dtf));
		
		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(endDateTime.format(dtf)));
	}
}

//	출력 : 
//	2023-01-19
//	2023년 01월 19일
//	2023.01.19 오후 18:30:12
//	오늘은 목요일
//	올해의 19번째 날
//	이달의 19번째 날

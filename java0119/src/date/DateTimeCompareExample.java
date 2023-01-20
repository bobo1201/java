package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.now();
		System.out.println("시작일 : " + startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2023,3,31,6,0,0);
		System.out.println("종료일 : " + endDateTime.format(dtf));
		
		if(startDateTime.isBefore(endDateTime)) {
			//스타트 시간이 엔드 시간 이전에 있는지 확인해라
			System.out.println("진행 중입니다.");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다.");
		} else if(startDateTime.isAfter(endDateTime)) {
			//스타트 시간이 엔드 시간 이후에 있는지 확인해라
		System.out.println("종료합니다.");
		}
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		System.out.println("남은 해 : " + remainYear);
		System.out.println("남은 월 : " + remainMonth);
		System.out.println("남은 일 : " + remainDay);
		System.out.println("남은 시간 : " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
	}
}

//	출력 : 
//	시작일 : 2023.01.19 오후 17:46:31
//	종료일 : 2023.03.31 오전 06:00:00
//	진행 중입니다.
//	남은 해 : 0
//	남은 월 : 2
//	남은 일 : 70
//	남은 시간 : 1692
//	남은 분: 101533
//	남은 초 : 6092008

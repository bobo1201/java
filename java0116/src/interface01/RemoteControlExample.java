package interface01;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);

		System.out.println();
		
		// 정적 메소드 호출
		RemoteControl.changeBattery();
	}	
}

//	출력 : 
//	TV를 켭니다.
//	현재 TV 볼륨: 5
//	무음 처리합니다.
//	현재 TV 볼륨: 0
//	무음 해제합니다.
//	
//	Audio를 켭니다.
//	현재 Audio 볼륨: 5
//	무음 처리합니다.
//	현재 Audio 볼륨: 0
//	무음 해제합니다.
//	현재 Audio 볼륨: 5
//	
//	리모콘 건전지를 교환합니다.
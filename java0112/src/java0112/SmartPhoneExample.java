package java0112;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~ 네, 반갑습니다.");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();		
	}
}

//	출력 :
//	모델 : 갤럭시
//	색상 : 은색
//	와이파이 상태 : false
//	벨이 울립니다.
//	자기 : 여보세요.
//	상대방 : 안녕하세요! 저는 홍길동인데요.
//	자기 : 아~ 네, 반갑습니다.
//	전화를 끊습니다.
//	와이파이 상태를 변경했습니다.
//	인터넷에 연결합니다.
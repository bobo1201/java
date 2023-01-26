package interrupt;

public class PrintThread extends Thread {
	@Override
	public void run() {
		// stop 실행 될때까지 계속 스레드 실행
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}			
		} catch(InterruptedException e) {
		}
		
		// stop이 되면 리소스 정리 후 실행 종료
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
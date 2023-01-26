package stop;

public class PrintThread extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		// stop 실행 될때까지 계속 스레드 실행
		while(!stop) {
			System.out.println("실행 중");
		}
		// stop이 되면 리소스 정리 후 실행 종료
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}

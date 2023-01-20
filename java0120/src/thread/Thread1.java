package thread;

public class Thread1 {
	public static void main(String[] args) {
		MyThread th1 = new MyThread();
		Runnable th2 = new MyThread2();
		Thread t = new Thread(th2);
		th1.start();
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("메인 함수 진행 중" + i);
		}
	}
}

class MyThread extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("스레드 진행 중" + i);
		}
	}
}

class MyThread2 implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("러너블 진행 중" + i);
		}
	}
}


//	출력 : 
//	메인 함수 진행 중0
//	메인 함수 진행 중1
//	메인 함수 진행 중2
//	메인 함수 진행 중3
//	메인 함수 진행 중4
//	스레드 진행 중0
//	러너블 진행 중0
//	러너블 진행 중1
//	러너블 진행 중2
//	러너블 진행 중3
//	스레드 진행 중1
//	스레드 진행 중2
//	스레드 진행 중3
//	스레드 진행 중4
//	스레드 진행 중5
//	스레드 진행 중6
//	스레드 진행 중7
//	메인 함수 진행 중5
//	메인 함수 진행 중6
//	메인 함수 진행 중7
//	메인 함수 진행 중8
//	메인 함수 진행 중9
//	스레드 진행 중8
//	러너블 진행 중4
//	러너블 진행 중5
//	러너블 진행 중6
//	러너블 진행 중7
//	러너블 진행 중8
//	러너블 진행 중9
//	스레드 진행 중9
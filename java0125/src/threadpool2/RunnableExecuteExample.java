package threadpool2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {
	public static void main(String[] args) {
		// 1000개의 메일 생성
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"+i+"@my.com";
			mails[i][2] = "신상품 입고";
		}
			
		// ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		// 이메일을 보내는 작업 생성 및 처리 요청
		for(int i=0; i<1000; i++) {
			final int idx = i;
			// 해킹 방지때문에 고정을 시킵니다.
			// static이 있으면 변경 자체가 불가능 합니다.
			// public만 있으면 for문 한 번 실행할 동안 변수 변경 불가능합니다.
			
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("["+thread.getName()+"]"+
					from+" ==> " + to + ": " + content);
				}
			});
		}
		
		// ExecutorService 종료
		executorService.shutdown();
	}
}


//	출력 : 
//	[pool-1-thread-5]admin@my.com ==> member998@my.com: 신상품 입고
//	[pool-1-thread-4]admin@my.com ==> member997@my.com: 신상품 입고
//	[pool-1-thread-2]admin@my.com ==> member996@my.com: 신상품 입고
//	[pool-1-thread-1]admin@my.com ==> member995@my.com: 신상품 입고
//	[pool-1-thread-3]admin@my.com ==> member999@my.com: 신상품 입고
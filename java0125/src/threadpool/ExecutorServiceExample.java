package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		// 최대 스레드 개수 5개 고정
		
//		ExecutorService executorService = new ThreadPoolExecutor();
		// 생성된 스레드풀의 초기 수와 코어 수는 0개 이고, 작업 개수가 많아지면 새 스레드를 생성시켜
		// 작업을 처리한다. 60초 동안 스레드가 아무 작업을 하지 않으면 스레드를 풀에서 제거한다.
		
//		ExecutorService executorService = new ThreadPoolExecutor(
//				3,									// 코어 스레드 개수
//				100,								// 최대 스레드 개수
//				120L,								// 놀고 있는 시간
//				TimeUnit.SECONDS,					// 놀고 있는 시간 단위
//				new SynchronousQueue<Runnable>()	// 작업 큐
//				);
		
		executorService.shutdown();
	}
}

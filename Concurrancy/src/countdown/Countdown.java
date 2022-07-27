package countdown;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Countdown {

	public static class Threadpool {

		static ExecutorService s = Executors.newFixedThreadPool(4);
		final static CountDownLatch countDownLatch = new CountDownLatch(3);
		//static CyclicBarrier countDownLatch=new CyclicBarrier(4);

		static Runnable r = () -> {

			try {
				Thread.sleep(1000);
				countDownLatch.countDown();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName());

		};

		static Runnable r1 = () -> {
			try {
				Thread.sleep(2000);
				countDownLatch.countDown();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName());

		};
		static Runnable r2 = () -> {
			try {
				Thread.sleep(3000);
				countDownLatch.countDown();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName());

		};
		static Runnable r3 = () -> {
			try {
				Thread.sleep(4000);
				countDownLatch.countDown();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName());

		};
		static Runnable r4 = () -> {
			try {
				Thread.sleep(5000);
				countDownLatch.countDown();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName());

		};

		public static void main(String[] args) throws InterruptedException {

			s.execute(r);
			s.execute(r1);
			s.execute(r2);
			s.execute(r3);
			s.execute(r4);
			
			try {
				countDownLatch.await();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("sagar");

			s.shutdown();
			

		}

	}

}

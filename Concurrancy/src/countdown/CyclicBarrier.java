package countdown;

import java.util.concurrent.BrokenBarrierException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrier {

	public static class Threadpool {

		static ExecutorService s = Executors.newFixedThreadPool(5);
		static java.util.concurrent.CyclicBarrier c = new java.util.concurrent.CyclicBarrier(4);

		static Runnable r = () -> {

			try {
				Thread.sleep(0000);
				//c.await();
				System.out.println(Thread.currentThread().getName());

			} catch (InterruptedException e  //BrokenBarrierException e)
					){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		};

		static Runnable r1 = () -> {
			try {
				Thread.sleep(5000);
				c.await();
				System.out.println(Thread.currentThread().getName());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		};
		static Runnable r2 = () -> {
			try {
				Thread.sleep(1000);
				c.await();
				System.out.println(Thread.currentThread().getName());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			

		};
		static Runnable r3 = () -> {
			try {
				Thread.sleep(1000);
				c.await();
				System.out.println(Thread.currentThread().getName());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		

		};
		static Runnable r4 = () -> {
			try {
				Thread.sleep(1000);
				c.await();
				System.out.println(Thread.currentThread().getName());


			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		};

		public static void main(String[] args) throws InterruptedException {

			s.execute(r);
			s.execute(r1);
			s.execute(r2);
			s.execute(r3);
			s.execute(r4);
			
			c.reset();

			System.out.println("sagar");

			s.shutdown();

		}

	}

}

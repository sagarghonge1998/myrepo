package multitheading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Threedpool implements Runnable {

	 volatile static int count;
	

	AtomicInteger ss = null;

	public Threedpool() {
		ss = new AtomicInteger(0);
	}

	@Override
	public void run() {

		// System.out.println("sagar");
		count++;
		System.out.println(count);
		System.out.println("---------------------------------");

		ss.addAndGet(1);

		System.out.println(ss.get());

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// ArrayBlockingQueue<Integer> arrayBlockingQueue=new
	// ArrayBlockingQueue<Integer>(4);

	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(4);

		Runnable r = new Threedpool();

		for (int i = 0; i < 8; i++) {

			e.execute(r);

		}
		e.shutdown();

	}

}

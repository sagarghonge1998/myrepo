package countdown;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {

	private int delay;
	private CountDownLatch c;

	public Worker(int delay, CountDownLatch c, String name) {
		super();
		this.delay = delay;
		this.c = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(delay);
			c.countDown();
			System.out.println(Thread.currentThread().getName());

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

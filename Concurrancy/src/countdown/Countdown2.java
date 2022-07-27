package countdown;

import java.util.concurrent.CountDownLatch;

public class Countdown2 {
	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch c=new CountDownLatch(4);
		Worker w=new Worker(1000, c,"1" );
		Worker w1=new Worker(2000, c,"2" );
		Worker w2=new Worker(3000, c,"3" );
		Worker w3=new Worker(1000, c,"4" );
		
		Thread t=new Thread(w);
		Thread t1=new Thread(w1);
		Thread t2=new Thread(w2);
		Thread t3=new Thread(w3);
		t.start();
		t1.start();
		t2.start();
		t3.start();
		System.out.println("start");
		c.await();
		
		System.out.println("sagar my name");
		
		

	}

}

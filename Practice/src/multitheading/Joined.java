package multitheading;

public class Joined {

	synchronized void m1() {
		try {
			System.out.println("sagar");
			wait();

			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	synchronized void m2() {
		try {
			System.out.println("12345");
			Thread.sleep(1000);
			notifyAll();
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Joined j=new Joined();
		Thread t=new Thread()
		{ public void run() {
			j.m1();}
		};
		
		Thread t1=new Thread()
		{ public void run() {
			j.m2();}
		};
		
		t.start();
		t1.start();
		

	}
}

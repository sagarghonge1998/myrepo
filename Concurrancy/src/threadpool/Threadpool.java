package threadpool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Threadpool {

	static ExecutorService s = Executors.newFixedThreadPool(4);

	private static int x;

	static Runnable r = () -> {
		System.out.println("sagar");
		System.out.println(Thread.currentThread().getName());
		x++;
		System.out.println(x);

	};
	static Runnable r1 = () -> {
		System.out.println("sagar1");
		System.out.println(Thread.currentThread().getName());
		x++;
		System.out.println(x);
	};
	static Runnable r2 = () -> {
		System.out.println("sagar2");
		System.out.println(Thread.currentThread().getName());
		x++;
		

	};
	static Runnable r3 = () -> {
		System.out.println("sagar4");
		System.out.println(Thread.currentThread().getName());
		x++;
		System.out.println(x);

	};
	static Runnable r4 = () -> {
		System.out.println("sagar5");
		System.out.println(Thread.currentThread().getName());
		x++;
		System.out.println(x);
	};

	public static void main(String[] args) {
		int x = 0;

		try {
//			s.execute(r);
//			s.execute(r1);
//			s.execute(r2);
//			s.execute(r3);
//			s.execute(r4);
			Future<?> sj = s.submit(r);
			System.out.println();
			s.submit(r1);
			s.submit(r2);
			s.submit(r3);
			s.submit(r4);
			// s.wait(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		s.shutdown();
		System.out.println(x);
	}

}

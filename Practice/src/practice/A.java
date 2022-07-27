package practice;

public class A {

	public int data(int x) {
		if (x == 1) {
			return 1;
		} else

			return (x * data(x - 1));

	}

	public static void main(String[] args) {

		int s = 1;
		A a = new A();
		s = s * (a.data(3));

		System.out.println(s);

		
	}

}

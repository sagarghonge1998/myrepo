package practice;

public class C {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int x = 6;

		int p = 0;
		int b[] = new int[a.length];

		for (int j = 1; j <= a.length / x; j++) {

			for (int k = 1; k <= x; k++) {

				b[p] = a[(j * x) - (k)];
				p++;

			}
		}

		for (int k = 1; k <= a.length % x; k++) {

			b[p] = a[(a.length) - k];
			p++;

		}
		for (int k : b) {
			 System.out.println(k);
		}
	}
}
package practice;

public class B {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int x = 4;
		int y = 0;
		int p = 0;
		int s = 0;
		int b[] = new int[a.length];

		if (a.length % x == 0) {
			s = x;
		} else
			s = (a.length / x) + 1;

		for (int j = 1; j <= s; j++) {
			y++;

			for (int k = 1; k <= x; k++) {
				int d;
				if (a.length / x >= y) {

					// System.out.println(y);
					b[p] = a[(y * x) - (k)];
					// System.out.println(a[(y*x)-(k)]);
					p++;

				} else {
					// System.out.println(y);
					// System.out.println((y-1)*x+(a.length%x)-1);

					 d = ((y - 1) * x + (a.length % x) - k);
					b[p] = a[d];
					
					System.out.println(d);
					d--;
					p++;
					

					if (a.length  == p) {
						break;
					}

				}
			}

		}

		for (int d : b) {
			System.out.println(d);
		}
	}

}

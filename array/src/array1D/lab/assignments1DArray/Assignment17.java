package array1D.lab.assignments1DArray;

public class Assignment17 {

	public static void mergeArray(int a[], int b[]) {

		int c[] = new int[a.length + b.length];
		int j = 0;

		for (int i = 0; i < c.length; i++) {

			if (i < a.length) {
				c[i] = a[i];
			} else {
				c[i] = b[j];
				j++;
			}

		}

		for (int i = 0; i < c.length; i++) {

			if (c[i] == -1) {
				continue;

			}

			for (int k = i + 1; k < c.length; k++) {

				if (c[i] == c[k]) {

					c[k] = -1;

				}

			}
		}

		for (int n : c) {

			if (n != -1) {
				System.out.println(n);
			}
		}

	}

	public static void main(String[] args) {

		int a[] = { 1, 4, 6, 8, 3, 20 };
		int b[] = { 1, 4, 6, 9, 7, 8, 1, 22, 3 };
		mergeArray(a, b);

	}

}

package array1D.lab.assignments1DArray;

public class Assignment33 {

	public static void placeEvenFirst(int a[]) {

		int b[] = new int[a.length];
		int j = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {

				b[j] = a[i];
				j++;

			}
		}

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				b[j] = a[i];
				j++;

			}
		}

		for (int n : b) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {
		int a[] = { 7, 12, 5, 14, 8, 9, 6, 19, 25 };
		placeEvenFirst(a);

	}

}

package array1D.lab.assignments1DArray;

public class Assignment32 {

	public static void placeNegativeElemFirst(int a[]) {

		int temp;

		for (int j = 0; j < a.length; j++) {

			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] > a[i + 1]) {

					temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;
				}

			}

		}

		for (int n : a) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {
		int a[] = { -7, 12, -1, -5, 23, -23, 67, -24, 98, -4 };
		placeNegativeElemFirst(a);

	}

}

package array1D.lab.assignments1DArray;

public class Assignment30 {

	public static void replaceNegativeWithSquare(int a[]) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] < 0) {

				a[i] = a[i - 1] * a[i - 1];

			}

		}

		System.out.println("New array :");
		for (int n : a) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {

		int array[] = { 12, 3, -19, 29, 5, -61, 44, 7, -9 };
		replaceNegativeWithSquare(array);

	}

}

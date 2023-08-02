package array1D.lab.assignments1DArray;

public class Assignment45 {

	public static void shuffleArray(int a[]) {

		int temp = a[0];

		for (int i = 0; i < a.length - 1; i++) {

			a[i] = a[i + 1];

		}
		a[a.length - 1] = temp;

		System.out.println("New array after shuffling :");
		for (int n : a) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {

		int a[] = { 5, 6, 23, 67, 39, 10, 2 };
		shuffleArray(a);

	}

}

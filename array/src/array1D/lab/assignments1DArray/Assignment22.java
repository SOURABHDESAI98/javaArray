package array1D.lab.assignments1DArray;

public class Assignment22 {

	public static void reverseArray(int a[]) {

		int b[] = new int[a.length];
		int j = 0;
		int k = 0;

		for (int i = a.length - 1; i >= 0; i--) {

			b[j] = a[i];
			j++;

		}

		for (int n : b) {
			a[k] = n;
			k++;
		}

		System.out.println("Same array having reversed elements :");

		for (int n : a) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {

		int array[] = { -20, 0, -25, 15, 19, 37, 23 };
		reverseArray(array);

	}
}

package array1D.lab.assignments1DArray;

public class Assignment21 {

	public static void reverseArray(int a[]) {

		int b[] = new int[a.length];
		int j = 0;

		for (int i = a.length - 1; i >= 0; i--) {

			b[j] = a[i];
			j++;

		}

		System.out.println("Reverse array :");

		for (int n : b) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {

		int array[] = { -20, 0, -25, 15, 19, 37, 23 };
		reverseArray(array);

	}

}

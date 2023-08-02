package array1D.lab.assignments1DArray;

public class Assignment9 {
	public static void copyArray(int a[], int b[]) {

		for (int i = 0; i < a.length; i++) {

			b[i] = a[i];

		}
		System.out.println("Elements of array1 is copied in array2");
		System.out.println("Array 2 :");
		for (int n : b) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {

		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = new int[5];
		copyArray(array1, array2);

	}

}

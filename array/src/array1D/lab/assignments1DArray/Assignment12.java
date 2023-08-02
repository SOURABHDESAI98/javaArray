package array1D.lab.assignments1DArray;

public class Assignment12 {

	static int max;
	static int min;

	public static void findMax(int a[]) {

		max = a[0];

		for (int n : a) {

			if (n > max) {

				max = n;
			}
		}
		System.out.println("Max number :" + max);
	}

	public static void findMin(int a[]) {

		min = a[0];

		for (int n : a) {

			if (n < min) {

				min = n;
			}
		}
		System.out.println("Min number :" + min);
	}

	public static void main(String[] args) {

		int array[] = { 56, 23, 345, 11, 3, 45, 846 };
		findMax(array);
		findMin(array);

	}

}

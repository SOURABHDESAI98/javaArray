package array1D.lab.assignments1DArray;

public class Assignment28 {

	static int max;
	static int min;
	static double sum = 0;
	static double avg;

	public static void findAvg(int a[]) {

		for (int n : a) {

			if (n != max && n != min) {
				sum = sum + n;
			}

		}

		avg = sum / (a.length - 2);

		System.out.println("Average without max and min is :" + avg);

	}

	public static void findMinMax(int a[]) {

		max = a[0];

		for (int n : a) {

			if (n > max) {

				max = n;
			}
		}

		min = a[0];

		for (int n : a) {

			if (n < min) {

				min = n;
			}
		}

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		findMinMax(a);
		findAvg(a);

	}

}

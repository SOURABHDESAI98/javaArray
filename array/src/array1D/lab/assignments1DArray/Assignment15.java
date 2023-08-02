package array1D.lab.assignments1DArray;

public class Assignment15 {

	static int min;

	public static void findSecondMin(int a[]) {

		int k = 0;
		int b[] = new int[a.length - 1];

		while (k < 2) {
			int i = 0;

			min = a[0];

			for (int n : a) {

				if (n < min) {

					min = n;
				}
			}

			if (k == 1) {
				break;
			}

			for (int n : a) { // creating new array named b

				if (n != min) {
					b[i] = n;
					i++;
				}

			}
			a = b;
			k++;
			continue;

		}

		System.out.println("Secong min number :" + min);

	}

	public static void main(String[] args) {

		int array[] = { 56, 23, 345, 11, 3, 45, 846 };
		findSecondMin(array);

	}

}

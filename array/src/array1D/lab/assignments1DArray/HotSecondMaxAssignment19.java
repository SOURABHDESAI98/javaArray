package array1D.lab.assignments1DArray;

public class HotSecondMaxAssignment19 {

	// instead of this logic do ascending sorting and print second last number

	static int max;

	public static void findSecondMax(int a[]) {

		int k = 0;
		int b[] = new int[a.length - 1];

		while (k < 2) {
			int i = 0;

			max = a[0];

			for (int n : a) {

				if (n > max) {

					max = n;
				}
			}

			if (k == 1) {
				break;
			}

			for (int n : a) { // creating new array named b

				if (n != max) {
					b[i] = n;
					i++;
				}

			}
			a = b;
			k++;
			continue;

		}

		System.out.println("Secong max number :" + max);

	}

	public static void main(String[] args) {

		int array[] = { 56, 23, 345, 11, 3, 45, 846 };
		findSecondMax(array);

	}

}

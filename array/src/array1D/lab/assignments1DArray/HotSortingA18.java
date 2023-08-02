package array1D.lab.assignments1DArray;

public class HotSortingA18 {

	public static int[] sortAscending(int a[]) {

		int temp;

		for (int j = 0; j < a.length; j++) { // just iterating multiple times for getting proper sorting

			for (int i = 0; i < a.length - 1; i++) { // avoid last element

				if (a[i] > a[i + 1]) {

					temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;

				}
			}

		}

		return a;

	}

	public static void main(String[] args) {

		int a[] = { 12, 32, 11, 87, 34, 77, 95, 35 };
		int sortedArray[] = sortAscending(a);

		for (int n : sortedArray) {

			System.out.println(n);
		}

	}

}

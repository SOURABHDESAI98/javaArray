package array1D.lab.assignments1DArray;

public class HotFindUniqueNum14 {

	public static void findUniqueNum(int a[]) {

		int count;

		System.out.println("Unique elements are :");

		for (int i = 0; i < a.length; i++) {

			count = 0;

			if (a[i] == -1) {
				continue;
			}

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					count++;
					a[j] = -1;
				}

			}

			if (count == 0) {
				System.out.println(a[i]);
			}

		}

	}

	public static void main(String[] args) {

		int array[] = { 2, 3, 5, 2, 7, 2, 4, 3, 5, 8, 9 };
		findUniqueNum(array);

	}

}

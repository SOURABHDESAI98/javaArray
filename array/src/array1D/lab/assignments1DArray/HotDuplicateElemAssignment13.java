package array1D.lab.assignments1DArray;

public class HotDuplicateElemAssignment13 {

	public static void findDuplicate(int a[]) {

		int count;

		System.out.println("Duplicate elements :");

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

			if (count > 0) {
				System.out.println(a[i] + " appeared " + count + " times");
			}

		}

	}

	public static void main(String[] args) {

		int array[] = { 2, 3, 5, 2, 4, 2, 4, 3, 5, 8, 2, 4 };
		findDuplicate(array);

	}

}

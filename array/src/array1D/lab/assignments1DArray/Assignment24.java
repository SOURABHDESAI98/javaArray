package array1D.lab.assignments1DArray;

public class Assignment24 {

	public static void findDuplicate(int a[]) {

		System.out.println("Duplicate elements :");

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.println(a[i]);
					break;

				}

			}

		}

	}

	public static void main(String[] args) {

		int array[] = { 3, 10, 90, 78, 56, 10, 78, 34, 61 };
		findDuplicate(array);

	}

}

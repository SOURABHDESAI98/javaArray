package array1D.lab.assignments1DArray;

public class Assignment25 {

	public static void findCommon(int a[], int b[]) {

		System.out.println("Common elements between two arrays :");

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {

					System.out.println(a[i]);
					break;

				}

			}

		}

	}

	public static void main(String[] args) {

		int arr1[] = { 12, 23, 34, 67, 78, 91, 56 };
		int arr2[] = { 39, 25, 15, 23, 55, 91, 66, 22 };
		findCommon(arr1, arr2);

	}

}

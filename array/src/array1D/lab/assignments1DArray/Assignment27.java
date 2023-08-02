package array1D.lab.assignments1DArray;

public class Assignment27 {

	public static void findMissing(int a[]) {

		int i = 1;
		for (int n : a) {

			if (n != i) {

				System.out.println("Missing number is " + i);
				i++;

			}
			i++;

		}

	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		findMissing(array);

	}

}

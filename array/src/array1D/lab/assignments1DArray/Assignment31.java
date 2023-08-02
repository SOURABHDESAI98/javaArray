package array1D.lab.assignments1DArray;

public class Assignment31 {

	public static void checkForSpecifiedElements(int a[]) {

		int count65 = 0;
		int count77 = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 65) {

				count65++;

			}

			if (a[i] == 77) {

				count77++;

			}

		}
		System.out.println("65 present " + count65 + " times");
		System.out.println("77 present " + count77 + " times");

	}

	public static void main(String[] args) {
		int array[] = { 65, 3, 77, 29, 77, 65, 44, 77, -9 };
		checkForSpecifiedElements(array);

	}

}

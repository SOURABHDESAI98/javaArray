package array1D.lab.assignments1DArray;

public class Assignment49 {

	public static void checkEquality(int a[], int b[]) {

		boolean flag = false;
		int count;

		for (int i = 0; i < b.length; i++) {
			count = 0;

			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {
					count++;
				}
			}

			if (count == 0) {
				flag = true;
				break;
			}

		}

		if (flag) {
			System.out.println("Both arrays are not equal");
		} else {
			System.out.println("Both arrays are equal");
		}

	}

	public static void main(String[] args) {

		int a[] = { 12, 22, 32, 42, 52, 62 };
		int b[] = { 52, 22, 62, 12, 42, 32 };
		checkEquality(a, b);

	}

}

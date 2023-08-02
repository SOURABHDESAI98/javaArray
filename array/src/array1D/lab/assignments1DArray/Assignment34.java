package array1D.lab.assignments1DArray;

public class Assignment34 {

	public static void findMinChar(int a[]) {
		int min = a[0];
		char c;

		for (int i = 1; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];

			}

		}
		c = (char) min;

		System.out.println("Minimum character is :" + c);

	}

	public static void main(String[] args) {

		int arr[] = { 'A', 'D', 'E', 'x', 'z', 'R' };
		findMinChar(arr);

	}

}

package array1D.lab.assignments1DArray;

public class Assignment35 {

	public static void findMaxChar(int a[]) {
		int max = a[0];
		char c;

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];

			}

		}
		c = (char) max;

		System.out.println("Maximum character is :" + c);

	}

	public static void main(String[] args) {

		int arr[] = { 'A', 'D', 'E', 'x', 'Z', 'R', 'p' };
		findMaxChar(arr);

	}

}

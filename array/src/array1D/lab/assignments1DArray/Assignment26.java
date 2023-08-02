package array1D.lab.assignments1DArray;

public class Assignment26 {

	public static void reverseHalf(int a[]) {

		int n = a.length;
		int j = n - 2;
		int temp;

		System.out.println("Reversed array :");

		for (int i = 0; i < n / 2; i++) {

			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j++;

		}

		for (int c : a) {

			System.out.println(c);
		}

	}

	public static void main(String[] args) {

		int a[] = { 2, 4, 9, 0 };
		reverseHalf(a);

	}

}

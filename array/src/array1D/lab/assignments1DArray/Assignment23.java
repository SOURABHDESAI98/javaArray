package array1D.lab.assignments1DArray;

public class Assignment23 {

	public static void reverseArray(int a[]) {

		int j = a.length - 1;
		int temp;

		for (int i = 0; i < a.length / 2; i++) { // i<a.length/2 is same for both odd and even number of elements

			temp = a[i];
			a[i] = a[j];
			a[j] = temp;

			j--;

		}

		System.out.println("Reversed array without temporary array :");

		for (int n : a) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {

		int array[] = { -20, 0, -25, 15, 19, 37, 23 };
		reverseArray(array);

	}

}

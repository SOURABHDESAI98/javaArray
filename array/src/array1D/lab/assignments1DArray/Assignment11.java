package array1D.lab.assignments1DArray;

import java.util.ArrayList;

public class Assignment11 {

	public static void findEvenNum(int a[], ArrayList<Integer> b) {
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				b.add(a[i]);

			}

		}

		System.out.println("Even elements array");
		for (int n : b) {
			System.out.println(n);

		}
	}

	public static void forEach(int a[], ArrayList<Integer> b) {

		for (int odd : a) {
			if (odd % 2 == 0) {

				b.add(odd);
			}

		}

		System.out.println("Odd elements array");
		for (int n : b) {
			System.out.println(n);

		}
	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayList<Integer> oddArray = new ArrayList<Integer>();
		ArrayList<Integer> evenArray = new ArrayList<Integer>();
		forEach(array, oddArray);
		findEvenNum(array, evenArray);

	}

}

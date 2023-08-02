package array1D.lab.assignments1DArray;

import java.util.Scanner;

public class Assignment4 {

	public static void findPositiveNum(int a[]) {

		for (int n : a) {
			if (n > 0) {
				System.out.println(n);
			}
		}

	}

	public static void main(String[] args) {
		int array[] = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.println("Provide value");
			array[i] = sc.nextInt();
		}
		sc.close();
		findPositiveNum(array);

	}

}

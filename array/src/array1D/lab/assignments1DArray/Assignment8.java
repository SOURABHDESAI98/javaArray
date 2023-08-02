package array1D.lab.assignments1DArray;

import java.util.Scanner;

public class Assignment8 {

	public static void searchNumber(int a[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Which number you want to search :");
		int b = sc.nextInt();
		sc.close();

		for (int i = 0; i < a.length; i++) {

			if (b == a[i]) {
				System.out.println("Number is present at " + i + "th index");
			}
		}

	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		searchNumber(array);

	}

}

package array1D.lab.assignments1DArray;

import java.util.Scanner;

public class Assignment3 {

	public void findEvenNum(int a[]) {
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				System.out.println(a[i]);

			}

		}
	}

	public void forEach(int a[]) {

		for (int odd : a) {

			if (odd % 2 == 0) {
				System.out.println(odd);
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

		Assignment3 a = new Assignment3();
		System.out.println("Even numbers");
		a.findEvenNum(array);
		System.out.println("Odd numbers");
		a.forEach(array);

	}

}

package array1D.afternoon;

import java.util.Scanner;

public class UsingForEachLoopForArray {

	public static void main(String[] args) {

		String names[];
		names = new String[4];

		Scanner sc = new Scanner(System.in);
		System.out.println("How many names you want to provide");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Provide name");
			names[i] = sc.next();

		}
		sc.close();
		System.out.println();

		// for each loop
		for (String name : names) {

			System.out.println(name);

		}

		// Printing array in reverse order

		int j = names.length - 1;

		for (; j > 0; j--) {
			System.out.println(names[j]);

		}

	}

}

package array1D.lab.assignments1DArray;

import java.util.Scanner;

public class Assignment6 {

	public static void findPrimeNum(int a[]) {
		System.out.println("Prime numbers :");
		boolean flag;

		for (int n : a) {

			if (n != 1) { // 1 is not prime number & 2 is prime number
				flag = true;

				for (int i = 2; i < n; i++) {

					if (n % i == 0) {
						flag = false;
					}

				}
				if (flag) {
					System.out.println(n);
				}

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
		findPrimeNum(array);

	}

}

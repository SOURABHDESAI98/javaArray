package array1D.lab.assignments1DArray;

import java.util.Scanner;

public class Assignment37 {

	public static void printTableArray(int num) {

		int array[] = new int[10];

		for (int i = 1; i <= 10; i++) {

			array[i - 1] = num * i;

		}

		System.out.println("Table of given number :");

		for (int n : array) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide a number :");
		int num = sc.nextInt();
		printTableArray(num);
		sc.close();

	}

}

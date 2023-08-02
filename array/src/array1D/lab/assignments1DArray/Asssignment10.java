package array1D.lab.assignments1DArray;

import java.util.Scanner;

public class Asssignment10 {

	public static void insertNumber(int a[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide a number :");
		int num = sc.nextInt();
		System.out.println("At what index you want to insert a number :");
		int index = sc.nextInt();
		sc.close();

		for (int i = 0; i < a.length; i++) {

			if (index == i) {
				a[i] = num;

			}

		}
		System.out.println("New array after inserting number is :");
		for (int n : a) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		insertNumber(array);

	}

}

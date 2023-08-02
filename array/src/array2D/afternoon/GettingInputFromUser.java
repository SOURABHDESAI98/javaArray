package array2D.afternoon;

import java.util.Scanner;

public class GettingInputFromUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input no. of rows :");
		int row = sc.nextInt();

		System.out.println("Input no. of columns :");
		int col = sc.nextInt();

		int a[][] = new int[row][col];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				System.out.println("Enter element for a[" + i + "]" + "[" + j + "] element");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Your array is :");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}

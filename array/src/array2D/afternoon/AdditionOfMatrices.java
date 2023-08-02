package array2D.afternoon;

import java.util.Scanner;

public class AdditionOfMatrices {

	public static void main(String[] args) {

		int row = 2, col = 2;

		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int sum[][] = new int[row][col];

		Scanner sc = new Scanner(System.in);

		System.out.println("Input elements of 1st array :");
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				System.out.println("Element at mat1[" + i + "]" + "[" + j + "]");
				mat1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Input elements of 2nd array :");
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				System.out.println("Element at mat2[" + i + "]" + "[" + j + "]");
				mat2[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				sum[i][j] = mat1[i][j] + mat2[i][j];
			}
		}

		System.out.println("New matrix is :");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}

}

package array2D.lab;

public class FindMaxMinInRow {

	public static void findMaxInRow(int a[][]) {
		int max;
		int row;

		for (int i = 0; i < 2; i++) {
			max = a[i][0];
			for (int j = 1; j < 3; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
			row = i + 1;
			System.out.println("Max element in " + row + "st row is :" + max);
		}

	}

	public static void findMinInRow(int a[][]) {
		int max;
		int row;

		for (int i = 0; i < 2; i++) {
			max = a[i][0];
			for (int j = 1; j < 3; j++) {
				if (a[i][j] < max) {
					max = a[i][j];
				}
			}
			row = i + 1;
			System.out.println("Min element in " + row + "st row is :" + max);
		}

	}

	public static void main(String[] args) {

		int a[][] = { { 22, 31, 9 }, { 12, 25, 16 } };
		findMaxInRow(a);
		System.out.println();
		findMinInRow(a);

	}
}

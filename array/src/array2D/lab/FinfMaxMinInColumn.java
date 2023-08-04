package array2D.lab;

public class FinfMaxMinInColumn {

	public static void findMaxInColumn(int a[][]) {
		int max, col;

		for (int i = 0; i < 3; i++) { // column

			max = a[0][i];
			for (int j = 1; j < 3; j++) { // row
				if (a[j][i] > max) {
					max = a[j][i];
				}
			}

			col = i + 1;
			System.out.println("Max element in " + col + " column is :" + max);
		}
	}

	public static void findMinInColumn(int a[][]) {
		int min, col;

		for (int i = 0; i < 3; i++) { // column

			min = a[0][i];
			for (int j = 1; j < 3; j++) { // row
				if (a[j][i] < min) {
					min = a[j][i];
				}
			}

			col = i + 1;
			System.out.println("Min element in " + col + " column is :" + min);
		}
	}

	public static void main(String[] args) {

		int a[][] = { { 22, 31, 9 }, { 12, 25, 16 }, { 34, 42, 2 } };
		findMaxInColumn(a);
		System.out.println();
		findMinInColumn(a);

	}

}

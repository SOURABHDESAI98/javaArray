package array2D.afternoon;

public class ForEachLoopFor2DArray {

	public static void main(String[] args) {
		int row = 2;
		int column = 3;

		int a[][] = new int[row][column];

		a[0][0] = 12;
		a[0][1] = 14;
		a[0][2] = 11;
		a[1][0] = 19;
		a[1][1] = 15;
		a[1][2] = 18;

		for (int rows[] : a) {

			for (int cols : rows) {
				System.out.print(cols + " ");
			}
			System.out.println();
		}

	}

}

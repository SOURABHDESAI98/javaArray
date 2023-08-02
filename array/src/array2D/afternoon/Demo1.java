package array2D.afternoon;

public class Demo1 {

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

		System.out.println("Elements of 2*3 array :");
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}

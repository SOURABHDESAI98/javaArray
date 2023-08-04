package array2D.lab;

public class PrintDiagonalElements {

	public static void main(String[] args) {
		int a[][] = { { 22, 31, 9 }, { 12, 25, 16 }, { 34, 42, 2 } };

		System.out.println("Diagonal elements :");
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i][i]);
		}

	}

}

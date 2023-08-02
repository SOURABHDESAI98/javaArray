package array1D.afternoon;

public class Replace0 {

	public static void replaceZero(int a[]) {

		System.out.println("New array after replacing zeros is :");

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 0) {
				a[i] = 1;
			}

		}

		for (int n : a) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {
		int array[] = { 78, 2, 55, 0, 8, 42, 79, 0, 0, 69, 56 };
		replaceZero(array);

	}

}

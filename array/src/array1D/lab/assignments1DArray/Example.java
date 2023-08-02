package array1D.lab.assignments1DArray;

public class Example {

	public static void findPair(int a[], int val) {
		boolean flag;
		int sum;
		int temp;
		System.out.println("The pairs are :");
		for (int i = 0; i < a.length - 1; i++) {
			sum = 0;
			flag = false;
			temp = 0;

			for (int j = i + 1; j < a.length; j++) {

				sum = a[i] + a[j];
				if (sum == val) {

					flag = true;
					temp = a[j];

				}

			}

			if (flag) {
				System.out.println(a[i] + " " + temp);
			}

		}

	}

	public static void main(String[] args) {

		int a[] = { 1, 4, 7, 8, 14, 11, 3, 2, 5 };
		int val = 6;
		findPair(a, val);

	}

}

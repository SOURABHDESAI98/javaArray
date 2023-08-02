package array1D.afternoon;

public class OperationsOnArrayByMethodApproach {
	int sum = 0;

	public void findSum(int a[]) {
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of elements :" + sum);
	}

	public void findEvenNum(int a[]) {
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				System.out.println(a[i]);

			}

		}
	}

	public void forEach(int a[]) {
		for (int odd : a) {
			if (odd % 2 == 0)
				System.out.println(odd);

		}

	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 }; // literal array

		OperationsOnArrayByMethodApproach sum = new OperationsOnArrayByMethodApproach();
		sum.findSum(array);
		System.out.println("Even numbers");
		sum.findEvenNum(array);
		System.out.println("Odd numbers");
		sum.forEach(array);

	}

}

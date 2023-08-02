package array1D.lab.assignments1DArray;

public class HotFrequencyA16 {

	public static void findFrequency(int a[]) {

		int count;

		System.out.println("Frequency of elements");

		for (int i = 0; i < a.length; i++) {

			count = 1; // Frequency \of each element will be at least 1

			if (a[i] == -1) { // neglecting -1 from comparison
				continue;
			}

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {

					count++;
					a[j] = -1; // assigning -1 in place of duplicate elements

				}
			}

			System.out.println(a[i] + ":" + count);

		}

	}

	public static void main(String[] args) {

		int array[] = { 2, 3, 5, 2, 4, 2, 4, 3, 5, 8, 2, 4 };
		findFrequency(array);

	}

}

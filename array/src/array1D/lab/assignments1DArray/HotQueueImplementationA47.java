package array1D.lab.assignments1DArray;

import java.util.Scanner;

public class HotQueueImplementationA47 {

	public static int[] push(int a[], int num) {

		int b[] = new int[a.length + 1];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		b[b.length - 1] = num;

		display(b);
		return b;

	}

	public static int[] pop(int a[]) {

		int b[] = new int[a.length - 1];

		for (int i = 0; i < a.length - 1; i++) {
			b[i] = a[i + 1];
		}

		display(b);
		return b;

	}

	public static void display(int b[]) {

		System.out.println("Updated array :");
		for (int n : b) {

			System.out.print(n + " ");

		}
		System.out.println();

	}

	public static void main(String[] args) {

		int a[] = new int[0];

		boolean flag, flag2, flag3;
		int count = 0;
		int b[] = new int[0]; // remove

		Scanner sc = new Scanner(System.in);

		do {

			if (count == 0) { // keep

				System.out.println("Enter number to push : ");

				int num = sc.nextInt();

				b = push(a, num); // declare & keep

			} else {

				System.out.println("Do you want to push :"); // remove
				flag3 = sc.nextBoolean();

				if (flag3 == true) {

					System.out.println("Enter number to push : ");

					int num = sc.nextInt();

					b = push(a, num);

				} // remove

			}

			System.out.println("Do you want to pop a number ");
			flag = sc.nextBoolean();

			if (flag == true) {
				int c[] = pop(b);
				a = new int[c.length];
				for (int k = 0; k < c.length; k++) {

					a[k] = c[k];

				}

			} else if (flag == false) {
				a = new int[b.length];
				for (int k = 0; k < b.length; k++) {

					a[k] = b[k];

				}

			}

			System.out.println("Do you want to continue ");
			flag2 = sc.nextBoolean();
			count++;

		} while (flag2 == true);

		sc.close();

	}

}

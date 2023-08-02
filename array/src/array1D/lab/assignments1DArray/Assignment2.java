package array1D.lab.assignments1DArray;

import java.util.Scanner;

public class Assignment2 {

	static int sum = 0;
	static double avg;

	public static void calculateSum(int a[]) {

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}
		System.out.println("Sum is " + sum);

	}

	public static void calculateAvg(int a[]) {

		avg = sum / a.length;
		System.out.println("Average is : " + avg);

	}

	public static void main(String[] args) {

		int array[] = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.println("Provide value");
			array[i] = sc.nextInt();
		}
		sc.close();
		calculateSum(array);
		calculateAvg(array);

	}

}

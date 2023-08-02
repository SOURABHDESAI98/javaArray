package array1D.afternoon.arrayOfObject;

public class Demo1 {

	String name;
	int marks[];
	boolean flag;

	public Demo1(String name, int marks[]) {
		this.name = name;
		this.marks = marks;

	}

	public void checkEligibility() {
		flag = true;
		for (int n : marks) {

			if (n < 35) {

				flag = false;

			}
		}

		if (flag) {

			System.out.println(name + " is eligible for calculation of sum");

			int sum = 0;
			for (int i = 0; i < marks.length; i++) {

				sum = sum + marks[i];

			}
			if (sum > 400) {
				System.out.println("Sum is greater than 400");
				System.out.println();

			} else {
				System.out.println("Sum is less than 400");
				System.out.println();
			}

		} else {
			System.out.println(name + " is not eligible for calculation of sum");
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int m1[] = { 98, 99, 56, 98, 63 };
		int m2[] = { 41, 65, 23, 45, 47 };
		int m3[] = { 98, 96, 98, 95, 95 };

		Demo1 d[] = new Demo1[3];

		d[0] = new Demo1("neel", m1);
		d[1] = new Demo1("nitin", m2);
		d[2] = new Demo1("mukesh", m3);

		for (Demo1 n : d) {
			n.checkEligibility();
		}

	}

}

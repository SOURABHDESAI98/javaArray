package array1D.afternoon.arrayOfObject;

import java.util.Arrays;

class Student {
	private int id;
	private String name;
	private double marks[];

	public Student() {

	}

	public Student(int id, String name, double marks[]) {

		this.id = id;
		this.name = name;
		this.marks = marks;

	}

	public void show(Student s[]) {

		for (Student n : s) {

			System.out.println(n);
			System.out.println("---------------------**----------------------");

		}
	}

	public String toString() {
		return "name:" + name + " ID:" + id + " Marks:" + Arrays.toString(marks);
	}

	public static void main(String[] args) {

		double m1[] = { 89, 87, 82 };
		double m2[] = { 81, 85, 78 };
		double m3[] = { 71, 75, 94 };

		Student stu[] = new Student[3];
		stu[0] = new Student(101, "sourabh", m1);
		stu[1] = new Student(102, "sunil", m2);
		stu[2] = new Student(103, "mukesh", m3);

		Student s = new Student();
		s.show(stu);

	}

}

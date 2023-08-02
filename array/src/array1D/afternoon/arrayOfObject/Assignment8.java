package array1D.afternoon.arrayOfObject;

class Stud {

	int roolNo;
	String name;
	int age;
	double marks;

	Stud(int roolNo, String name, int age, double marks) {
		this.roolNo = roolNo;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

}

public class Assignment8 {

	public static void main(String[] args) {

		System.out.println("Students having marks more than 60 and age less than 15 :");

		Stud stu[] = new Stud[4];
		stu[0] = new Stud(101, "Sourabh", 14, 98);
		stu[1] = new Stud(102, "Neel", 25, 57);
		stu[2] = new Stud(103, "Nitin", 26, 42);
		stu[3] = new Stud(104, "Mukesh", 12, 78);

		for (Stud s : stu) {
			if (s.age < 15 && s.marks > 60) {
				System.out.println(s.name);
			}
		}

	}

}

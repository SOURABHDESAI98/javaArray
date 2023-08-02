package array1D.lab.assignments1DArray;

class Departs {
	int id;
	String name;

	public Departs(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {

		return "department id: " + id + " department name: " + name;
	}
}

class Date2 {

	int day;
	int month;
	int year;

	public Date2(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;

	}

	public String toString() {
		return "day " + day + " month " + month + " year " + year;
	}
}

class Employees2 {

	int id;
	String name;
	double salary;
	Date2 date;
	Departs dept;

	public Employees2(int id, String name, double salary, Date2 date, Departs dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
		this.dept = dept;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;

	}

	public double getSalary() {
		return salary;

	}

	public Date2 getDate() {
		return date;
	}

	public Departs getDept() {
		return dept;
	}

}

public class HotArrayOfObjectA41 {

	public static void main(String[] args) {

		Employees2 emp[] = new Employees2[3];
		emp[0] = new Employees2(101, "neel", 35000, new Date2(1, 2, 2023), new Departs(201, "Mechanical"));
		emp[1] = new Employees2(102, "nitin", 45000, new Date2(2, 1, 2023), new Departs(202, "Computer"));
		emp[2] = new Employees2(103, "mukesh", 40000, new Date2(12, 2, 2023), new Departs(203, "Mechanical"));

		for (int i = 0; i < emp.length; i++) {

			System.out.println(emp[i].getId());
			System.out.println(emp[i].getName());
			System.out.println(emp[i].getSalary());
			System.out.println(emp[i].getDate());
			System.out.println(emp[i].getDept());
			System.out.println("---------------------");
		}

		for (int i = 0; i < emp.length; i++) {

			for (int j = i + 1; j < emp.length; j++) {

				if (emp[i].getDept().name == emp[j].getDept().name) {
					System.out.println(emp[i].name + " and " + emp[j].name + " belongs to same department");
				}
			}

		}
		System.out.println("---------------------");

	}

}

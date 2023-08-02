package array1D.lab.assignments1DArray;

class Date {

	int day;
	int month;
	int year;

	public Date(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;

	}

	public String toString() {
		return "day " + day + " month " + month + " year " + year;
	}
}

class Employees {

	int id;
	String name;
	double salary;
	Date date;

	public Employees(int id, String name, double salary, Date date) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;

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

	public Date getDate() {
		return date;
	}

}

public class Assignment39 {

	public static void main(String[] args) {

		Employees emp[] = new Employees[3];
		emp[0] = new Employees(101, "neel", 35000, new Date(1, 2, 2023));
		emp[1] = new Employees(102, "nitin", 45000, new Date(2, 1, 2023));
		emp[2] = new Employees(103, "mukesh", 40000, new Date(12, 2, 2023));

		for (Employees e : emp) {

			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			System.out.println(e.getDate());
			System.out.println("---------------------");
		}

	}

}

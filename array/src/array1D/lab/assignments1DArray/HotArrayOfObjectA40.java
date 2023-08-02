package array1D.lab.assignments1DArray;

class Depart {
	int id;
	String name;

	public Depart(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {

		return "department id: " + id + " department name: " + name;
	}
}

class Date1 {

	int day;
	int month;
	int year;

	public Date1(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;

	}

	public String toString() {
		return "day " + day + " month " + month + " year " + year;
	}
}

class Employees1 {

	int id;
	String name;
	double salary;
	Date1 date;
	Depart dept;

	public Employees1(int id, String name, double salary, Date1 date, Depart dept) {
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

	public Date1 getDate() {
		return date;
	}

	public Depart getDept() {
		return dept;
	}

}

public class HotArrayOfObjectA40 {

	public static void main(String[] args) {

		Employees1 emp[] = new Employees1[3];
		emp[0] = new Employees1(101, "neel", 35000, new Date1(1, 2, 2023), new Depart(201, "Mechanical"));
		emp[1] = new Employees1(102, "nitin", 45000, new Date1(2, 1, 2023), new Depart(202, "Computer"));
		emp[2] = new Employees1(103, "mukesh", 40000, new Date1(12, 2, 2023), new Depart(203, "Physics"));

		for (Employees1 e : emp) {

			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			System.out.println(e.getDate());
			System.out.println(e.getDept());
			System.out.println("---------------------");
		}
	}
}

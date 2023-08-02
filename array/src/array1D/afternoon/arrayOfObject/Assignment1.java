package array1D.afternoon.arrayOfObject;

class Employees {

	int id;
	String name;
	double salary;

	public Employees() {

	}

	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

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

	public void filter(Employees emp[]) {

		System.out.println("Employees with salary greater than 10000 :");

		for (Employees e : emp) {

			if (e.getSalary() > 10000) {
				System.out.println(e);
			}
		}

	}

	public String toString() {

		return "name " + name + " id " + id + " salary : " + salary;
	}

}

public class Assignment1 {

	public static void main(String[] args) {

		Employees emp[] = new Employees[3];
		emp[0] = new Employees(101, "neel", 35000);
		emp[1] = new Employees(102, "nitin", 45000);
		emp[2] = new Employees(103, "mukesh", 40000);

		for (Employees e : emp) {

			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			System.out.println("---------------------");
		}

	}

}

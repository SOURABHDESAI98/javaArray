package array1D.lab.assignments1DArray;

class Employee {

	int id;
	String name;
	double salary = 40000;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {

		return "id " + id + " name " + name + " salary " + salary;
	}
}

public class Assignment36 {

	public static void main(String[] args) {

		Employee emp[] = new Employee[3];
		emp[0] = new Employee(101, "neel");
		emp[1] = new Employee(102, "nitin");
		emp[2] = new Employee(103, "mukesh");

		for (Employee e : emp) {

			System.out.println(e);
			System.out.println();
		}

	}

}

package array1D.afternoon.arrayOfObject;

public class Assignment2 {

	public static void main(String[] args) {

		Employees emp[] = new Employees[3];
		emp[0] = new Employees(101, "neel", 35000);
		emp[1] = new Employees(102, "nitin", 5000);
		emp[2] = new Employees(103, "mukesh", 40000);

		Employees em = new Employees();
		em.filter(emp);

	}

}

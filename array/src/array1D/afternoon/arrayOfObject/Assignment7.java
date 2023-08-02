package array1D.afternoon.arrayOfObject;

public class Assignment7 {

	public static void main(String[] args) {

		Employees2 emp[] = new Employees2[3];

		Date2 d = new Date2(8, 4, 2008);

		emp[0] = new Employees2(101, "sourabh", new Date2(7, 4, 2015));

		emp[1] = new Employees2(102, "sunil", d);

		emp[2] = new Employees2(103, "sukesh", d);

		System.out.println("Employees who joined on same date :");

		for (int i = 0; i < emp.length - 1; i++) {

			for (int j = i + 1; j < emp.length; j++) {

				if (emp[i].date == emp[j].date) {
					System.out.println(emp[i].name + " and " + emp[j].name);
				}
			}

		}

	}

}

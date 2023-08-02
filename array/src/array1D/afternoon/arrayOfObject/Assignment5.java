package array1D.afternoon.arrayOfObject;

public class Assignment5 {

	public static void main(String[] args) {
		Employees1 emp[] = new Employees1[5];
		emp[0] = new Employees1(101, "neel", 35000, new Date1(1, 2, 2023), new Depart(201, "Mechanical"));
		emp[1] = new Employees1(102, "nitin", 45000, new Date1(2, 1, 2023), new Depart(202, "Computer"));
		emp[2] = new Employees1(103, "sourabh", 40000, new Date1(4, 2, 2023), new Depart(203, "Physics"));
		emp[3] = new Employees1(104, "mukesh", 37000, new Date1(7, 2, 2023), new Depart(204, "Sales"));
		emp[4] = new Employees1(105, "Tushar", 40000, new Date1(9, 2, 2023), new Depart(204, "Sales"));

		System.out.println("Employess in same department :");

		for (int i = 0; i < emp.length - 1; i++) {

			for (int j = i + 1; j < emp.length; j++) {

				if (emp[i].getDept().name == emp[j].getDept().name) {

					System.out.println(emp[i].name + " and " + emp[j].name);

				}

			}
		}

	}

}

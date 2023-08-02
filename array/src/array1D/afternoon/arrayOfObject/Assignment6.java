package array1D.afternoon.arrayOfObject;

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
	Date2 date;

	public Employees2(int id, String name, Date2 date) {
		this.id = id;
		this.name = name;
		this.date = date;

	}

}

public class Assignment6 {

	public static void main(String[] args) {

		Employees2 emp[] = new Employees2[3];

		emp[0] = new Employees2(101, "sourabh", new Date2(7, 4, 2015));

		emp[1] = new Employees2(102, "sunil", new Date2(8, 4, 2008));

		emp[2] = new Employees2(103, "sukesh", new Date2(8, 4, 2008));

		System.out.println("Employees who joined after 2010");

		for (Employees2 e : emp) {

			if (e.date.year > 2010) {
				System.out.println(e.name);
			}
		}

	}

}

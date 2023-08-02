package array1D.afternoon.arrayOfObject;

public class Demo2 {

	private String name;
	private int id;
	private int marks;

	public Demo2() {

	}

	public Demo2(String name, int id, int marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public static void filter(Demo2 d[]) {

		for (Demo2 n : d) {

			if (n.getMarks() > 80) {
				System.out.println(n);
			}
		}
	}

	public String toString() {

		return "name " + name + " id " + id + " marks " + marks;
	}

	public static void main(String[] args) {

		Demo2 d[] = new Demo2[3];

		d[0] = new Demo2("neel", 101, 98);
		d[1] = new Demo2("nitin", 102, 94);
		d[2] = new Demo2("mukesh", 103, 96);

		filter(d);

	}

}

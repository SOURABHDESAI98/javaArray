package array1D.lab.arrayLab.model;

public class Books {

	private int id;
	private String name;
	private float price;

	public Books() {

	}

	public Books(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {

		return "*Book name:" + name + "\n Book id:" + id + "\n Book price:" + price + "Rs.";
	}

}

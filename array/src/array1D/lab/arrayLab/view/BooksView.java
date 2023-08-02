package array1D.lab.arrayLab.view;

import java.util.Scanner;

import array1D.lab.arrayLab.model.Books;
import array1D.lab.arrayLab.service.BooksService;

public class BooksView {
	int bid;
	String bname;
	float bprice;
	static BooksService bService = new BooksService();
	Scanner sc = new Scanner(System.in);

	public void addBook() {

		System.out.println("Enter book Id:");
		bid = sc.nextInt();
		System.out.println("Enter book name:");
		bname = sc.next();
		System.out.println("Enter book price:");
		bprice = sc.nextFloat();

		bService.addBookService(new Books(bid, bname, bprice));
	}

	public void modifyName() {

		System.out.println("Enter id of book that you want to modify:");
		bid = sc.nextInt();
		System.out.println("Enter book name that you want to put:");
		bname = sc.next();

		bService.modifyBookNameService(bid, bname);

	}

	public void modifyPrice() {

		System.out.println("Enter id of book that you want to modify:");
		bid = sc.nextInt();
		System.out.println("Enter price that you want to set:");
		bprice = sc.nextFloat();
		bService.modifyBookPriceService(bid, bprice);
	}

	public void display(Books b[]) {

		for (Books n : b) {

			if (n != null) {
				System.out.println(n);
			}
		}

	}

	public static void main(String[] args) {

		Books b[];

		BooksView bView = new BooksView();

		Scanner sc = new Scanner(System.in);

		boolean permission;

		do {

			System.out.println("1.Add new book" + "\n2.modify name of book" + "\n3.modify price of book");

			System.out.println("Enter your choice :");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				bView.addBook();
				bView.addBook();
				bView.addBook();
				b = bService.getAllBooksService();
				bView.display(b);
				break;

			case 2:
				bView.modifyName();
				b = bService.getAllBooksService();
				bView.display(b);
				break;

			case 3:

				bView.modifyPrice();
				b = bService.getAllBooksService();
				bView.display(b);
				break;

			}

			System.out.println("Do you want to continue ?");
			permission = sc.nextBoolean();

		} while (permission == true);

	}

}

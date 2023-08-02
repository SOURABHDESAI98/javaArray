package array1D.lab.arrayLab.dao;

import array1D.lab.arrayLab.model.Books;

public class BooksDao {

	static Books b[] = new Books[3];
	static int index = 0;

	public boolean addBook(Books book) {

		if (index < b.length) {
			b[index] = book;
			index++;

			return true;

		} else {
			return false;
		}

	}

	public Books[] getAllBooks() {

		return b;

	}

	public void modifyBookName(int bid, String bname) {

		for (Books n : b) {

			if (n.getId() == bid) {
				n.setName(bname);
			}
		}

	}

	public void modifyBookPrice(int bid, float bprice) {

		for (Books n : b) {

			if (n.getId() == bid) {
				n.setPrice(bprice);
			}
		}

	}

}

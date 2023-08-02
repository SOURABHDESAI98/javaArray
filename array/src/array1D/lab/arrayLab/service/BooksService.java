package array1D.lab.arrayLab.service;

import array1D.lab.arrayLab.dao.BooksDao;
import array1D.lab.arrayLab.model.Books;

public class BooksService {

	static BooksDao bDao = new BooksDao();

	public Books[] getAllBooksService() {

		return bDao.getAllBooks();

	}

	public boolean addBookService(Books book) {

		return bDao.addBook(book);

	}

	public void modifyBookNameService(int bid, String bname) {
		bDao.modifyBookName(bid, bname);

	}

	public void modifyBookPriceService(int bid, float bprice) {
		bDao.modifyBookPrice(bid, bprice);
	}

}

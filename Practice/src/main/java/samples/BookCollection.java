package samples;

import java.util.List;

public class BookCollection {
	List<Book> bookList;
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public Book getfirstBook()
	{
		return getBookList().get(0);
	}
}

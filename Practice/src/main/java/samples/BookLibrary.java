package samples;

import java.util.List;

public class BookLibrary {
	List<Book> allBooks;
	Book getFristBook;
	public List<Book> getAllBooks() {
		return allBooks;
	}
	public void setAllBooks(List<Book> allBooks) {
		this.allBooks = allBooks;
	}
	public Book getGetFristBook() {
		return getFristBook;
	}
	public void setGetFristBook(Book getFristBook) {
		this.getFristBook = getFristBook;
	}
}

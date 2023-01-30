package samples;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
  		 BookLibrary b1= (BookLibrary) context.getBean("bl1");
		 BookLibrary b2= (BookLibrary) context.getBean("bl2");
		 List<Book>allbooks=b1.getAllBooks();
		 for(Book b:allbooks)
			 System.out.println(b.getBookId()+" "+b.getBookName());
		 Book fistBook=b1.getGetFristBook();
		 System.out.println("this is the first book: "+ fistBook.getBookId()+" "+fistBook.getBookName());
		 List<Book>allbooks1=	b2.getAllBooks();
		 for(Book b:allbooks1)
			 System.out.println(b.getBookId()+" "+b.getBookName());
		 System.out.println("this is the first book: "+ b2.getGetFristBook().getBookId()+" "+b2.getGetFristBook().getBookName());

	}

}
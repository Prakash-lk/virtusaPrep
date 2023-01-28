package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {
	public static void main(String args[]){
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		
		TextEditor te = a.getBean(TextEditor.class);
		te.spellCheck();
	}

}

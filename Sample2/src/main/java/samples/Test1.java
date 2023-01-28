package samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		 Question q1= context.getBean( Question.class);
		 q1.displayInfo();	


	}

}

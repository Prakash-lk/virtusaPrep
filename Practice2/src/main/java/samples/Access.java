package samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		 RandomNumberGenerator r= (RandomNumberGenerator) context.getBean("randomObj");
		 System.out.println("the random number is: "+r.getRandomNumber());
		 System.out.println("the pi value is: "+r.getPi());
		 System.out.println("mydata value from another class: "+r.getDatafromanotherclass());
		 System.out.println("mydata function from another class: "+r.getGetvaluefromanotherfunction());
	}

}

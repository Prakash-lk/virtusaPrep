package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Access {
	public static void main(String[] args) {
		/*Car car=new Car();
		car.drive();
		Bike bike=new Bike();
		bike.drive();*/
		
		/*Vehicle obj=new Car();
		obj.drive();
		obj=new Bike();
		obj.drive();*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
//		Vehicle obj=(Vehicle)context.getBean("vehicle");
//		obj.drive();
//		Tyre t=(Tyre)context.getBean("tyre");
//		System.out.println(t);
		Car obj=(Car)context.getBean("car");
		obj.drive();
	}
}

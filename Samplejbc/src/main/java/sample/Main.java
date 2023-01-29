package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.beans;

public class Main {
	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(beans.class);
		Car ad=a.getBean("ad",Car.class);
		ad.setName("Tesla");
		ad.setColour("White");
		Bike s=a.getBean("getBike",Bike.class);
		s.setName("Honda");
		s.setColour("Red");
		System.out.println(s.getName()+" - "+s.getColour());
		System.out.println(ad.getName()+" - "+ad.getColour());
	}
	
}

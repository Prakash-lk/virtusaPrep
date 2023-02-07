package sample;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class refact {

	public static void main(String[] args) {
		  SessionFactory factory;
	      ServiceRegistry serviceRegistry;
	      Configuration config = new Configuration().configure();
	        
	        config.addAnnotatedClass(Students.class);
	       
	        serviceRegistry = new  ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
	        factory = config.buildSessionFactory(serviceRegistry);
	 
	        Students s = new Students();
	   		 s.setRoll(11111);
	   		 s.setName("mynew val");
	   		 s.setCollegeName("vvnn");
	   	 Session sess= factory.openSession();
	   	 sess.save(s);
	   	 
	   	 
	   	 List<Students> stu=  sess.createQuery(" From Students").list();
	   	
   		for(Students s1: stu)
   			System.out.println(s1.getRoll()+" "+s1.getName()+" "+s1.getCollegeName());
   			
         
	   			 
	}

}

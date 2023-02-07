package sample;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class refact {

	public static void main(String[] args) {
		  SessionFactory factory;
	      ServiceRegistry serviceRegistry;
	      Configuration config = new Configuration().configure();
	        
	        config.addAnnotatedClass(Person.class);
	       
	        serviceRegistry = new  ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
	        factory = config.buildSessionFactory(serviceRegistry);
	 
	        Person s = new Person();
	   		// s.setRoll( );// dont set auto increment 
	   		 s.setName("rrr");
	   		 s.setCollegeName("ar1");
	   	 Session sess= factory.openSession();
	  Transaction 	transaction = sess.beginTransaction();
	     sess.save(s); // inser record
	    transaction.commit();
	    
	    
	 	//list all records 
	   	 List<Person> stu=  sess.createQuery(" From Person").list();
	   	
  		for(Person s1: stu)
  			System.out.println(s1.getRoll()+" "+s1.getName()+" "+s1.getCollegeName());
  		//select single record
  		 Person single = (Person) sess.get(Person.class, 3);// fetch particular record
  	 	System.out.println("single record: "+single.getRoll()+" "+single.getName()+" "+single.getCollegeName());
  		
  //delete selected record		 
  transaction=sess.beginTransaction();	
  	 sess.delete(single);
  	 transaction.commit(); 
  	 
  //list all records 
  	 List<Person> stu1=  sess.createQuery(" From Person").list();
  	
		for(Person s1: stu1)
			System.out.println(s1.getRoll()+" "+s1.getName()+" "+s1.getCollegeName());
		
		//update specific record
		 Person stuObj = (Person) sess.get(Person.class, 3);
         stuObj.setName("Sai");
         sess.beginTransaction().commit();
      	 
         //list all records 
         	 List<Person> stu2=  sess.createQuery(" From Person").list();
         	
       		for(Person s1: stu2)
       			System.out.println(s1.getRoll()+" "+s1.getName()+" "+s1.getCollegeName());
       		
	}

}
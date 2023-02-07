package sample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {
	
	private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;
	static private int insertUser(Person s)
    {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer userIdSaved = null;
        try {
            tx = session.beginTransaction();
           
            userIdSaved = (Integer) session.save(s);
            tx.commit();
        } catch(HibernateException ex) {
            if(tx != null)
                tx.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
         
        return userIdSaved;
         
    }
     
   static private List<Person> listUsers()
    {
        Session sesn = factory.openSession();
        Transaction tx = null;
        List<Person> users = new ArrayList();
        try{
            tx = sesn.beginTransaction();
            users =  sesn.createQuery(" From Person").list();
            tx.commit();
        } catch(HibernateException e) {
            e.printStackTrace();
        } finally {
            sesn.close();
        }
         
        return users;
    }
	public static void main(String[] args) {
		 Configuration config = new Configuration().configure();
	        
	        config.addAnnotatedClass(Person.class);
	       
	        serviceRegistry = new  ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
	        factory = config.buildSessionFactory(serviceRegistry);
	 
	        Person s = new Person();
	   		 s.setRoll(34);
	   		 s.setName("Vina");
	   		 s.setCollegeName("FFF");
	   	insertUser(s);
	   		 
	   		 s.setRoll(34);
	   		 s.setName("Vinan");
	   		 s.setCollegeName("xxx");
	   		  // insertUser(s); 
	   		List<Person> stu= listUsers();
	   		for(Person s1: stu)
	   			System.out.println(s1.getRoll()+" "+s1.getName()+" "+s1.getCollegeName());
	   			
	         
	}

}

package sample;

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
	static private int insertUser(Persons s)
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
     
  
	public static void main(String[] args) {
		 Configuration config = new Configuration().configure();
	        
	        config.addAnnotatedClass(Persons.class);
	       
	        serviceRegistry = new  ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
	        factory = config.buildSessionFactory(serviceRegistry);
	         
	        Persons s = new Persons();
	   		 s.setRoll(19065);
	   		 s.setName("Prakash L");
	   		 s.setCollegeName("KRCT");
	   		 insertUser(s);
	   		
	}

}


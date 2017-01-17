package utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	
	private final static SessionFactory sf = new Configuration()
	        .configure("hibernate.cfg.xml").buildSessionFactory();
	
    private volatile static Session session = sf.openSession();
    
	private HibernateUtility() {
	}

	public static Session getHibernateSession() {
	      if(session == null) {
	    	  session = (Session) new HibernateUtility();
	       }
	       return session;
	}
}

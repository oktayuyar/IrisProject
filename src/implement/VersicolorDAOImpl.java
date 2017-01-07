package implement;

import org.hibernate.Session;
import utility.HibernateUtility;

import interfaces.VersicolorDAO;

public class VersicolorDAOImpl implements VersicolorDAO{

	Session session = HibernateUtility.getHibernateSession();
	
	@Override
	public void getVersicolorAv() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getVersicolorStd() {
		// TODO Auto-generated method stub
		
	}


}

package implement;

import org.hibernate.Session;
import utility.HibernateUtility;

import interfaces.SetosaDAO;

public class SetosaDAOImpl implements SetosaDAO{

	Session session = HibernateUtility.getHibernateSession();

	@Override
	public void getSetosaAv() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSetosaStd() {
		// TODO Auto-generated method stub
		
	}

}

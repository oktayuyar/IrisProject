package implement;

import org.hibernate.Session;
import utility.HibernateUtility;

import interfaces.VirginicaDAO;

public class VirginicaDAOImpl implements VirginicaDAO{

	Session session = HibernateUtility.getHibernateSession();

	@Override
	public void getVirginicaAv() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getVirginicaStd() {
		// TODO Auto-generated method stub
		
	}


}

package implement;

import org.hibernate.Session;
import utility.HibernateUtility;

import interfaces.VersicolorDAO;
import model.FlowerAv;
import model.FlowerStd;

public class VersicolorDAOImpl implements VersicolorDAO{

	Session session = HibernateUtility.getHibernateSession();

	@Override
	public FlowerAv getVersicolorAv(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlowerStd getVersicolorStd(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

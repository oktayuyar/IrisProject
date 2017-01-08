package implement;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import utility.HibernateUtility;

import interfaces.SetosaDAO;
import model.FlowerAv;
import model.FlowerStd;

public class SetosaDAOImpl implements SetosaDAO{

	Session session = HibernateUtility.getHibernateSession();

	@Override
	public FlowerAv getSetosaAv(int id) {
		FlowerAv setosaOrt=session.get(FlowerAv.class, id);
		return setosaOrt;
	}

	@Override
	public FlowerStd getSetosaStd(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

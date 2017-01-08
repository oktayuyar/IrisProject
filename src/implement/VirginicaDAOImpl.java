package implement;

import org.hibernate.Session;
import utility.HibernateUtility;

import interfaces.VirginicaDAO;
import model.FlowerAv;
import model.FlowerStd;

public class VirginicaDAOImpl implements VirginicaDAO{

	Session session = HibernateUtility.getHibernateSession();

	@Override
	public FlowerAv getVirginicaAv(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlowerStd getVirginicaStd(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

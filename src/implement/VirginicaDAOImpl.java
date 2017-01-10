package implement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import utility.HibernateUtility;

import interfaces.VirginicaDAO;
import model.FlowerAv;
import model.FlowerStd;

public class VirginicaDAOImpl implements VirginicaDAO{
    public double cyboyOrt,cyenOrt,tyboyOrt,tyenOrt;
    public double cyboyStd,cyenStd,tyboyStd,tyenStd;

    FlowerAv virginicaAv=new FlowerAv();
    FlowerStd virginicaStd=new FlowerStd();
    public ArrayList<Double> values = new ArrayList<Double>();
    
	Session session = HibernateUtility.getHibernateSession();

    // Burada virginicanın yaprak verilerini liste şeklinde çekiyoruz 
    // Bu listeyi standart sapma hesaplamada kullanacağız
	@Override
	public List<Double> getVirginicaValues(String cicekturu, String yturu) {
		Query<Double> query = session.createQuery("select "+ yturu +
				" from Flower where cicek_turu like  '%" + cicekturu + "%'");
		
		List<Double> list =query.list();		
        for (Double a : list) {
		    values.add(a);
		}
		return values;

	}
    // Standart sapmayı burada hesaplıyoruz yükarıda liste şeklinde dönen verileri bu fonksiyona gönderiyoruz 
	// O yaprak türü için ortalamayıda bu fonksiyona gönderiyoruz
	@Override
	public void StandartSapmaHesapla(double ort, List<Double> list) {
        double temp = 0;
        double kareToplam = 0; 

        for (int i = 0; i < list.size(); i++){ 
            kareToplam = kareToplam + list.get(i) * list.get(i); 			
        } 

        double stdsapma= Math.sqrt(kareToplam / list.size() - ort*ort);
        System.out.println(stdsapma);  
    } 
	// Iris-virginicanın ortalama değerlerini çekiyoruz  
	@Override
	public FlowerAv getVirginicaAv(int id) {
		virginicaAv=session.get(FlowerAv.class, id);
		cyboyOrt=virginicaAv.getCy_boy_ort();
		cyenOrt=virginicaAv.getCy_en_ort();
		tyboyOrt=virginicaAv.getTy_boy_ort();
		tyenOrt=virginicaAv.getTy_en_ort();
		return virginicaAv;
	}
	// Iris-virginicanın standart sapmalarını çekiyoruz 
	@Override
	public FlowerStd getVirginicaStd(int id) {
		virginicaStd=session.get(FlowerStd.class, id);
		cyboyStd=virginicaStd.getCy_boy_std();
		cyenStd=virginicaStd.getCy_en_std();
		tyboyStd=virginicaStd.getTy_boy_std();
		tyenStd=virginicaStd.getTy_en_std();
		return virginicaStd;
	}

}

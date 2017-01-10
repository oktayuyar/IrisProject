package implement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import utility.HibernateUtility;

import interfaces.VersicolorDAO;
import model.FlowerAv;
import model.FlowerStd;

public class VersicolorDAOImpl implements VersicolorDAO{
    public double cyboyOrt,cyenOrt,tyboyOrt,tyenOrt;
    public double cyboyStd,cyenStd,tyboyStd,tyenStd;
    
    FlowerAv versicolorAv=new FlowerAv();
    FlowerStd versicolorStd=new FlowerStd();
    public ArrayList<Double> values = new ArrayList<Double>();

	Session session = HibernateUtility.getHibernateSession();
    
    // Burada Versicolorun yaprak verilerini liste şeklinde çekiyoruz 
    // Bu listeyi standart sapma hesaplamada kullanacağız
	@Override
	public List<Double> getVersicolorValues(String cicekturu, String yturu) {
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
	// Iris-versicolorun ortalama değerlerini çekiyoruz  
	@Override
	public FlowerAv getVersicolorAv(int id) {
		versicolorAv=session.get(FlowerAv.class, id);
		cyboyOrt=versicolorAv.getCy_boy_ort();
		cyenOrt=versicolorAv.getCy_en_ort();
		tyboyOrt=versicolorAv.getTy_boy_ort();
		tyenOrt=versicolorAv.getTy_en_ort();
		return versicolorAv;
	}
	// Iris versicolorun standart sapma değerlerini çekiyoruz  
	@Override
	public FlowerStd getVersicolorStd(int id) {
		versicolorStd=session.get(FlowerStd.class, id);
		cyboyStd=versicolorStd.getCy_boy_std();
		cyenStd=versicolorStd.getCy_en_std();
		tyboyStd=versicolorStd.getTy_boy_std();
		tyenStd=versicolorStd.getTy_en_std();
		return versicolorStd;
	}
}

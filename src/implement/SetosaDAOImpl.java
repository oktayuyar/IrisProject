package implement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utility.HibernateUtility;
import interfaces.SetosaDAO;
import model.Flower;
import model.FlowerAv;
import model.FlowerStd;


public class SetosaDAOImpl implements SetosaDAO{
    public double cyboyOrt,cyenOrt,tyboyOrt,tyenOrt;
    public double cyboyStd,cyenStd,tyboyStd,tyenStd;
    
    FlowerAv setosaAv=new FlowerAv();
    FlowerStd setosaStd=new FlowerStd();
    public ArrayList<Double> values = new ArrayList<Double>();
    
	Session session = HibernateUtility.getHibernateSession();

    // Burada Setosanın yaprak verilerini liste şeklinde çekiyoruz 
    // Bu listeyi standart sapma hesaplamada kullanacağız
	@Override
	public List<Double> getSetosaValues(String cicekturu,String yturu) {
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
    public void StandartSapmaHesapla(double ort,List<Double> list){ 
        double temp = 0;
        double kareToplam = 0; 

        for (int i = 0; i < list.size(); i++){ 
            kareToplam = kareToplam + list.get(i) * list.get(i); 			
        } 

        double stdsapma= Math.sqrt(kareToplam / list.size() - ort*ort);
        System.out.println(stdsapma);  
    } 

	// Iris setosanın ortalama değerlerini çekiyoruz 
	@Override
	public FlowerAv getSetosaAv(int id) {
		setosaAv=session.get(FlowerAv.class, id);
		cyboyOrt=setosaAv.getCy_boy_ort();
		cyenOrt=setosaAv.getCy_en_ort();
		tyboyOrt=setosaAv.getTy_boy_ort();
		tyenOrt=setosaAv.getTy_en_ort();
		return setosaAv;
	}
	// Iris setosanın standart sapma değerlerini çekiyoruz
	@Override
	public FlowerStd getSetosaStd(int id) {
		setosaStd=session.get(FlowerStd.class, id);
		cyboyStd=setosaStd.getCy_boy_std();
		cyenStd=setosaStd.getCy_en_std();
		tyboyStd=setosaStd.getTy_boy_std();
		tyenStd=setosaStd.getTy_en_std();
		return setosaStd;
	}	
}

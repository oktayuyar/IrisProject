package interfaces;

import java.util.List;

import model.FlowerAv;
import model.FlowerStd;

public interface VersicolorDAO {
	
	public FlowerAv  getVersicolorAv(int id);

	public FlowerStd getVersicolorStd(int id);
	
	public List<Double> getVersicolorValues(String cicekturu,String yturu);

	public void StandartSapmaHesapla(double ort,List<Double> list);
}

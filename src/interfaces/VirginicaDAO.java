package interfaces;

import java.util.List;

import model.FlowerAv;
import model.FlowerStd;

public interface VirginicaDAO {
	
	public FlowerAv  getVirginicaAv(int id);

	public FlowerStd getVirginicaStd(int id);
	
	public List<Double> getVirginicaValues(String cicekturu,String yturu);

	public void StandartSapmaHesapla(double ort,List<Double> list);
}

package interfaces;

import model.FlowerAv;
import model.FlowerStd;

public interface VirginicaDAO {
	
	public FlowerAv  getVirginicaAv(int id);

	public FlowerStd getVirginicaStd(int id);
}

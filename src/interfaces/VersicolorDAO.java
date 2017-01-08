package interfaces;

import model.FlowerAv;
import model.FlowerStd;

public interface VersicolorDAO {
	
	public FlowerAv  getVersicolorAv(int id);

	public FlowerStd getVersicolorStd(int id);
}

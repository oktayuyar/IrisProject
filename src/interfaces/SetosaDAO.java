package interfaces;

import model.FlowerAv;
import model.FlowerStd;
public interface SetosaDAO {
	
	public FlowerAv  getSetosaAv(int id);

	public FlowerStd getSetosaStd(int id);
	
}

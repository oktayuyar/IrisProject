package interfaces;

import java.util.ArrayList;
import java.util.List;

import model.Flower;
import model.FlowerAv;
import model.FlowerStd;
public interface SetosaDAO {
	
	public FlowerAv  getSetosaAv(int id);

	public FlowerStd getSetosaStd(int id);
	
	public List<Double> getSetosaValues(String cicekturu,String yturu);

	public void deneme();
}

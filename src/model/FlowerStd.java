package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flower_std")
public class FlowerStd {
	@Id
    private int id;
    private double cy_boy_std;
    private double cy_en_std;
    private double ty_boy_std;
    private double ty_en_std;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCy_boy_std() {
		return cy_boy_std;
	}
	public void setCy_boy_std(double cy_boy_std) {
		this.cy_boy_std = cy_boy_std;
	}
	public double getCy_en_std() {
		return cy_en_std;
	}
	public void setCy_en_std(double cy_en_std) {
		this.cy_en_std = cy_en_std;
	}
	public double getTy_boy_std() {
		return ty_boy_std;
	}
	public void setTy_boy_std(double ty_boy_std) {
		this.ty_boy_std = ty_boy_std;
	}
	public double getTy_en_std() {
		return ty_en_std;
	}
	public void setTy_en_std(double ty_en_std) {
		this.ty_en_std = ty_en_std;
	}
    

}

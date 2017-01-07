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
	@GeneratedValue(strategy=GenerationType.TABLE)
    private int id;
	
    private Double cy_boy_std;
    private Double cy_en_std;
    private Double ty_boy_std;
    private Double ty_en_std;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getCy_boy_std() {
		return cy_boy_std;
	}
	public void setCy_boy_std(Double cy_boy_std) {
		this.cy_boy_std = cy_boy_std;
	}
	public Double getCy_en_std() {
		return cy_en_std;
	}
	public void setCy_en_std(Double cy_en_std) {
		this.cy_en_std = cy_en_std;
	}
	public Double getTy_boy_std() {
		return ty_boy_std;
	}
	public void setTy_boy_std(Double ty_boy_std) {
		this.ty_boy_std = ty_boy_std;
	}
	public Double getTy_en_std() {
		return ty_en_std;
	}
	public void setTy_en_std(Double ty_en_std) {
		this.ty_en_std = ty_en_std;
	}
}

package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flower_av")
public class FlowerAv {
	@Id
    private int id;

    private double cy_boy_ort;
    private double cy_en_ort;
    private double ty_boy_ort;
    private double ty_en_ort;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCy_boy_ort() {
		return cy_boy_ort;
	}
	public void setCy_boy_ort(double cy_boy_ort) {
		this.cy_boy_ort = cy_boy_ort;
	}
	public double getCy_en_ort() {
		return cy_en_ort;
	}
	public void setCy_en_ort(double cy_en_ort) {
		this.cy_en_ort = cy_en_ort;
	}
	public double getTy_boy_ort() {
		return ty_boy_ort;
	}
	public void setTy_boy_ort(double ty_boy_ort) {
		this.ty_boy_ort = ty_boy_ort;
	}
	public double getTy_en_ort() {
		return ty_en_ort;
	}
	public void setTy_en_ort(double ty_en_ort) {
		this.ty_en_ort = ty_en_ort;
	}
}

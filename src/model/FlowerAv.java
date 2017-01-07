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
	@GeneratedValue(strategy=GenerationType.TABLE)
    private int id;

    private Double cy_boy_ort;
    private Double cy_en_ort;
    private Double ty_boy_ort;
    private Double ty_en_ort;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getCy_boy_ort() {
		return cy_boy_ort;
	}
	public void setCy_boy_ort(Double cy_boy_ort) {
		this.cy_boy_ort = cy_boy_ort;
	}
	public Double getCy_en_ort() {
		return cy_en_ort;
	}
	public void setCy_en_ort(Double cy_en_ort) {
		this.cy_en_ort = cy_en_ort;
	}
	public Double getTy_boy_ort() {
		return ty_boy_ort;
	}
	public void setTy_boy_ort(Double ty_boy_ort) {
		this.ty_boy_ort = ty_boy_ort;
	}
	public Double getTy_en_ort() {
		return ty_en_ort;
	}
	public void setTy_en_ort(Double ty_en_ort) {
		this.ty_en_ort = ty_en_ort;
	}
}

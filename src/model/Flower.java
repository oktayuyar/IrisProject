package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flower")
public class Flower{
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
    private int id;
    
    private double cyaprak_boyu;
    private double cyaprak_eni;
    private double tyaprak_boyu;
    private double tyaprak_eni;
    private double cicekturu;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCyaprak_boyu() {
		return cyaprak_boyu;
	}
	public void setCyaprak_boyu(double cyaprak_boyu) {
		this.cyaprak_boyu = cyaprak_boyu;
	}
	public double getCyaprak_eni() {
		return cyaprak_eni;
	}
	public void setCyaprak_eni(double cyaprak_eni) {
		this.cyaprak_eni = cyaprak_eni;
	}
	public double getTyaprak_boyu() {
		return tyaprak_boyu;
	}
	public void setTyaprak_boyu(double tyaprak_boyu) {
		this.tyaprak_boyu = tyaprak_boyu;
	}
	public double getTyaprak_eni() {
		return tyaprak_eni;
	}
	public void setTyaprak_eni(double tyaprak_eni) {
		this.tyaprak_eni = tyaprak_eni;
	}
	public double getCicekturu() {
		return cicekturu;
	}
	public void setCicekturu(double cicekturu) {
		this.cicekturu = cicekturu;
	}
}
